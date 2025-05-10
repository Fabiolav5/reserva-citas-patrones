package cita;

public class CitaFactory {
    // Factory Method: crea instancias sin exponer la lógica de creación
    public Cita crearCita(TipoCita tipo, String fecha, String doctor) {
        switch (tipo) {
            case PRESENCIAL:
                return new CitaPresencial(fecha, doctor);
            case VIRTUAL:
                return new CitaVirtual(fecha, doctor);
            default:
                throw new IllegalArgumentException("Tipo no soportado");
        }
    }
}
