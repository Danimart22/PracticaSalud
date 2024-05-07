package PracticaSalud;
import java.time.LocalDate;
public class Paciente {
    private String nombre;
    private String Apellido;
    private int edad;
    private String RH;
    private String U_cita;
    public Paciente(String nombre, String apellido, int edad, String rH, String u_cita) {
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        RH = rH;
        U_cita = u_cita;
    }
    public Paciente(String nombre, String apellido, int edad, String rH) {
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        RH = rH;
    }
  
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getRH() {
        return RH;
    }
    public void setRH(String rH) {
        RH = rH;
    }
    public String getU_cita() {
        return U_cita;
    }
    public void setU_cita(String u_cita) {
        U_cita = u_cita;
    }
    public static String AsignarCita(int edad){
        String mensaje = "";
       if(edad >= 25 && edad < 35 ){
        mensaje = "2 meses y medio";
       }
       else if(edad >= 35 && edad < 45){
        mensaje = "Mes y medio";
       }else if(edad > 45 ){
        mensaje = "15 días";
       }else{
        mensaje = "No se asigna periodo";
         
       }
       return mensaje;
    }

}
