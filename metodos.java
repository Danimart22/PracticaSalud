package PracticaSalud;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class metodos {
    public static Paciente Nuevo_Paciente() {
        Paciente paciente_nuevo = new Paciente(null, null, 0, null);
        paciente_nuevo.setNombre(JOptionPane.showInputDialog("\nIngrese el nombre del paciente: "));
        paciente_nuevo.setApellido(JOptionPane.showInputDialog("\nIngrese el apellido del paciente: "));
        paciente_nuevo.setEdad(Integer.parseInt(JOptionPane.showInputDialog("\nIngrese la edad del paciente: ")));
        paciente_nuevo.setRH(JOptionPane.showInputDialog("\nIngrese el tipo de sangre (RH) del paciente: "));
        paciente_nuevo.setU_cita(JOptionPane.showInputDialog("\nIngrese la fecha de la ultima cita (en caso de que haya tenido) de el paciente en el formato (DD/MM/AAAA): "));
        return paciente_nuevo;

    }

    public static void Mostrar_Paciente(LinkedList<Paciente> pacientes) {
        for (Paciente paciente : pacientes) {
            JOptionPane.showMessageDialog(null,
                    "\nEl nombre de el paciente es: " + paciente.getNombre() + "\nEl apellido del paciente es: "
                            + paciente.getApellido() + "\nLa edad de el paciente es: " + paciente.getEdad()
                            + "\nEl RH del paciente es: " + paciente.getRH()
                            + "\nLa ultima cita de el paciente fue el: "
                            + paciente.getU_cita());
        }

    }

    public static void AsignarCita(LinkedList<Paciente> listaPacientees) {
        for (Paciente p : listaPacientees) {
            if (p.getEdad() >= 25 && p.getEdad() < 35) {
                JOptionPane.showMessageDialog(null, p.getNombre() + "tiene cita cada 2 meses y medio");
            } else if (p.getEdad() >= 35 && p.getEdad() < 45) {
                JOptionPane.showMessageDialog(null, p.getNombre() + " tiene cita cada mes y medio");
            } else if (p.getEdad() > 45) {
                JOptionPane.showMessageDialog(null, p.getNombre() + " tiene cita cada 15 días");
            } else {
                JOptionPane.showMessageDialog(null, p.getNombre() + " no se le asigna cita");

            }
        }

    }
    public static Doctores Registrar_Doctor (){
        Doctores doctor = new Doctores(null, null, null);
        doctor.setNombre(JOptionPane.showInputDialog("\nDigite el nombre de el doctor: "));
        doctor.setDisponibilidad(true);
        return doctor;
    }
    public static void AsignarCitaDoctor(LinkedList<Paciente> pacientes, LinkedList<Doctores> doctores){
        for (Paciente p : pacientes) {
            p.setS_cita("");
        }
    }
}
