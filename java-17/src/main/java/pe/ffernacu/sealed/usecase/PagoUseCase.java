package pe.ffernacu.sealed.usecase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.ffernacu.sealed.service.EventoPago;

public class PagoUseCase {

    private final Logger log = LoggerFactory.getLogger(PagoUseCase.class);

    private final EventoPago eventoPago;

    public PagoUseCase(EventoPago eventoPago) {
        this.eventoPago = eventoPago;
    }

    public void procesarPago(double monto){
        String mensaje = eventoPago.enviarmensaje(monto);
        log.info("{}", mensaje);
    }

}
