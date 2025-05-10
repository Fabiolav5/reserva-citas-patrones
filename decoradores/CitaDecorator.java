package decoradores;

import cita.Cita;

public abstract class CitaDecorator implements Cita {
    protected Cita cita;

    public CitaDecorator(Cita cita) {
        this.cita = cita;
    }
}
