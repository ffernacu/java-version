package pe.ffernacu.sealed.exception;

public final class UsuarioNoEncontradoException extends NegocioException {
    public UsuarioNoEncontradoException() {
        super("ERR-USUARIO", 404, "No existe el usuario");
    }
}
