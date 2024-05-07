package PracticaSalud;

import javax.swing.JOptionPane;
import java.util.LinkedList;
public class menu {
    public static void Menu(){
        int decision = 0;
        LinkedList<Paciente> listaPacientes = new LinkedList<>();
        listaPacientes = metodos.Nuevo_Paciente(listaPacientes);

        do{
            decision = Integer.parseInt(JOptionPane.showInputDialog("\n---MENU DEL PROGRAMA DE PACIENTES Y ASIGNACIÓN DE CITAS---\n\n1. Agregar un nuevo paciente\n2. Mostrar todos los pacientes registrados\n0. Para salir\n ELija unna opción: "));
            switch (decision) {
                case 1:
                    listaPacientes = metodos.Nuevo_Paciente(listaPacientes);

                    break;
                case 2:
                metodos.Mostrar_Paciente(listaPacientes);
                break;    
            
                default:
                    break;
            }

        }while(decision!=0);

    }
}
