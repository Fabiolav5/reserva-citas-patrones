package decoradores;

import cita.Cita;

public class RecordatorioSMS extends CitaDecorator {
    public RecordatorioSMS(Cita cita) {
        super(cita);
    }

    @Override
    public String getDescripcion() {
        return cita.getDescripcion() + " | Recordatorio por SMS";
    }
}
