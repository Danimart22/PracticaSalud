package PracticaSalud;
public class Paciente {
    private String nombre;
    private String Apellido;
    private int edad;
    private String RH;
    private String U_cita;
    private String S_cita;
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
    public String getS_cita() {
        return S_cita;
    }
    public void setS_cita(String s_cita) {
        S_cita = s_cita;
    }
    

}
