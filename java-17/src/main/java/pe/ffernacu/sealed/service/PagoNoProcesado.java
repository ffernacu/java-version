package pe.ffernacu.sealed.service;

import org.springframework.stereotype.Service;

@Service
public final class PagoNoProcesado implements EventoPago {

    @Override
    public String enviarmensaje(double monto) {
        return "Pago no procesado de: " + monto;
    }
}
