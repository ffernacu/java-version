package pe.ffernacu.sealed.service;

/**
 * @EventoPago solo permite ser implementado en las clases @PagoProcesado o @PagoNoProcesado
 */
public sealed interface EventoPago permits PagoProcesado, PagoNoProcesado {
    String enviarmensaje(double monto);
}
