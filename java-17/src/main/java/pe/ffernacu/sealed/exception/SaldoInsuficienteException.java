package pe.ffernacu.sealed.exception;

public final class SaldoInsuficienteException  extends NegocioException{
    public SaldoInsuficienteException() {
        super("ERR-SALDO", 422, "No tienes saldo suficiente");
    }
}
