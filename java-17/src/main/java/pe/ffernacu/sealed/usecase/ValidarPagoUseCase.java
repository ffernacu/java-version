package pe.ffernacu.sealed.usecase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.ffernacu.sealed.exception.NegocioException;
import pe.ffernacu.sealed.exception.SaldoInsuficienteException;

public class ValidarPagoUseCase {

    private final Logger log = LoggerFactory.getLogger(ValidarPagoUseCase.class);

    public void validarPago(double saldo){
        try {
            if (saldo == 0.0) throw new SaldoInsuficienteException();
            log.info("Saldo: {}", saldo);
        } catch (NegocioException ex) {
            // Usa los métodos heredados de la clase base directamente
            System.out.println("Status HTTP: " + ex.getHttpStatus());
            System.out.println("Código: " + ex.getCodigo());
            System.out.println("Detalle: " + ex.obtenerDetalleCompleto());

            // Y si necesitas un dato específico de una hija en particular:
            if (ex instanceof SaldoInsuficienteException saldoEx) {
                System.out.println("Monto faltante: S/ " + saldoEx.obtenerDetalleCompleto());
            }
        }
    }
}
