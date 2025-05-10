package cita;

public class CitaPresencial implements Cita {
    private String fecha;
    private String doctor;

    public CitaPresencial(String fecha, String doctor) {
        this.fecha = fecha;
        this.doctor = doctor;
    }

    @Override
    public String getDescripcion() {
        return "Cita PRESENCIAL con " + doctor + " el " + fecha;
    }
}
