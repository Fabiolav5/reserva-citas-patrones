package notificaciones;

import cita.Cita;

public class Paciente implements Observer {
    private String nombre;

    public Paciente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(Cita cita) {
        System.out.println("[Notificación] Hola " + nombre + ", su cita ha sido registrada: " + cita.getDescripcion());
    }
}
