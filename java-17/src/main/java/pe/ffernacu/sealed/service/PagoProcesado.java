package pe.ffernacu.sealed.service;

import org.springframework.stereotype.Service;

@Service
public final class PagoProcesado implements EventoPago {

    @Override
    public String enviarmensaje(double monto) {
        return "Pago Procesado de: "+ monto;
    }
}
