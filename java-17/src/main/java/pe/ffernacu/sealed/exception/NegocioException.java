package pe.ffernacu.sealed.exception;

public abstract sealed class NegocioException extends RuntimeException
permits  SaldoInsuficienteException, UsuarioNoEncontradoException {

    private final String codigo;

    private final int httpStatus;

    protected NegocioException(String codigo, int httpStatus, String mensaje) {
        super(mensaje);
        this.codigo = codigo;
        this.httpStatus = httpStatus;
    }

    // Métodos heredados por TODAS las excepciones hijas
    public String getCodigo() {
        return codigo;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public String obtenerDetalleCompleto() {
        return "[" + codigo + "] (HTTP " + httpStatus + "): " + getMessage();
    }
}
