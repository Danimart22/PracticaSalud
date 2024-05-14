package PracticaSalud;

public class Doctores {
    private String nombre;
    private Boolean disponibilidad;
    private String Fecha_Cita;
    public Doctores(String nombre, Boolean disponibilidad, String fecha_Cita) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        Fecha_Cita = fecha_Cita;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Boolean getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public String getFecha_Cita() {
        return Fecha_Cita;
    }
    public void setFecha_Cita(String fecha_Cita) {
        Fecha_Cita = fecha_Cita;
    }
    public Doctores(String nombre) {
        this.nombre = nombre;
    }
    
}
