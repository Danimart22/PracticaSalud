package PracticaSalud;

import javax.swing.JOptionPane;
import java.util.LinkedList;

public class menu {
    public static void Menu() {
        int decision = 0;
        LinkedList<Paciente> listaPacientes = new LinkedList<>();
        do {
            decision = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n---MENU DEL PROGRAMA DE PACIENTES Y ASIGNACIÓN DE CITAS---\n\n1. Agregar un nuevo paciente\n2. Mostrar todos los pacientes registrados\n3.Mostrar asignación de cita acorde a edad\n0. Para salir\n Elija una opción: "));
            switch (decision) {
                case 1:
                    listaPacientes.add(metodos.Nuevo_Paciente());
                    break;
                case 2:
                    if (listaPacientes.isEmpty()) {
                        JOptionPane.showMessageDialog(null,"\nLa lista de pacientes esta vacia por lo que no hay nada que mostrar");
                    } else {
                        metodos.Mostrar_Paciente(listaPacientes);
                    }

                    break;
                case 3:
                    if(listaPacientes.isEmpty()){
                        JOptionPane.showMessageDialog(null, "\nLa lista de pacientes esta vacia por lo que no hay nada que mostrar");
                    }else{
                        metodos.AsignarCita(listaPacientes);
                    }
                    
                    break;

                default:
                    break;
            }

        } while (decision != 0);

    }
}
