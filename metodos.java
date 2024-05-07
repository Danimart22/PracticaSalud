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
            paciente_nuevo.setU_cita(JOptionPane.showInputDialog("\nIngrese la fecha de la ultima cita (en caso de que haya tenido) de el paciente en el formato (DD/MM/AAAA): "));
            decision = JOptionPane.showInputDialog("\n¿Desea ingresar otro paciente?(S/N): ").toLowerCase();
            pacientes.add(paciente_nuevo);
    
        }while(decision.equals("s"));
        
        return pacientes;
    }
    public static String Mostrar_Paciente(LinkedList<Paciente> pacientes){
        String cadena = "";
        for (Paciente paciente : pacientes) {
            cadena ="\nEl nombre de el paciente es: "+paciente.getNombre() + "\nEl apellido del paciente es: "+ paciente.getApellido()+"\nLa edad de el paciente es: "+paciente.getEdad()+"\nEl RH del paciente es: "+paciente.getRH()+"\nLa ultima cita de el paciente fue el: "+paciente.getU_cita();       }
        return cadena;

    }
}
