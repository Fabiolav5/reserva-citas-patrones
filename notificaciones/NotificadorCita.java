package notificaciones;

import cita.Cita;
import java.util.*;

public class NotificadorCita {
    private List<Observer> observadores = new ArrayList<>();

    public void registrarObservador(Observer obs) {
        observadores.add(obs);
    }

    public void nuevaCita(Cita cita) {
        for (Observer obs : observadores) {
            obs.actualizar(cita);
        }
    }
}
