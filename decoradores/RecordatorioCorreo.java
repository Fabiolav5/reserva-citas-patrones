package decoradores;

import cita.Cita;

public class RecordatorioCorreo extends CitaDecorator {
    public RecordatorioCorreo(Cita cita) {
        super(cita);
    }

    @Override
    public String getDescripcion() {
        return cita.getDescripcion() + " | Recordatorio por CORREO";
    }
}
