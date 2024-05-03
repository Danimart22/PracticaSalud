package PracticaSalud;
import java.util.LinkedList;

import javax.swing.JOptionPane;
public class metodos {
    public static LinkedList<Paciente> Nuevo_Paciente(LinkedList<Paciente> pacientes){
        String decision = "";
        
        do{
            Paciente paciente_nuevo = new Paciente(null, null, 0, null);
            paciente_nuevo.setNombre(JOptionPane.showInputDialog("\nIngrese el nombre del paciente: "));
            paciente_nuevo.setApellido(JOptionPane.showInputDialog("\nIngrese el apellido del paciente: ")); 
            paciente_nuevo.setEdad(Integer.parseInt(JOptionPane.showInputDialog("\nIngrese la edad del paciente: ")));
            paciente_nuevo.setRH(JOptionPane.showInputDialog("\nIngrese el tipo de sangre (RH) del paciente: "));

    
        }while(decision.equals("s"));
        
        return pacientes;
    }
    public static String Mostrar_Paciente(LinkedList<Paciente> pacientes){
        String cadena = "";
        for (Paciente paciente : pacientes) {
            cadena = paciente.getNombre() + "\n"+ paciente.getApellido()+"\n"+paciente.getEdad()+"\n"+paciente.getRH();
        }
        return cadena;

    }
}
