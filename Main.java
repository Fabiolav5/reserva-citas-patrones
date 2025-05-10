import cita.*;
import decoradores.*;
import notificaciones.*;

public class Main {
    public static void main(String[] args) {
        // Patrón Creacional: Factory Method
        CitaFactory factory = new CitaFactory();
        Cita cita1 = factory.crearCita(TipoCita.PRESENCIAL, "10/05/2025", "Dr. López");

        // Patrón Estructural: Decorator
        cita1 = new RecordatorioCorreo(cita1);
        cita1 = new RecordatorioSMS(cita1);

        // Patrón de Comportamiento: Observer
        NotificadorCita notificador = new NotificadorCita();
        Paciente paciente = new Paciente("Fabiola");
        notificador.registrarObservador(paciente);

        notificador.nuevaCita(cita1);

        // Mostrar cita final con recordatorios
        System.out.println("\nResumen de la cita:");
        System.out.println(cita1.getDescripcion());
    }
}
