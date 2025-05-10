package cita;

public class CitaVirtual implements Cita {
    private String fecha;
    private String doctor;

    public CitaVirtual(String fecha, String doctor) {
        this.fecha = fecha;
        this.doctor = doctor;
    }

    @Override
    public String getDescripcion() {
        return "Cita VIRTUAL con " + doctor + " el " + fecha;
    }
}
