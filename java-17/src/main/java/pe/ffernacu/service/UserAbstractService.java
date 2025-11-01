package pe.ffernacu.service;

public abstract class UserAbstractService {
    public abstract String validUser(String value);
    protected String imprimirUser(String value){
        return "usuario encontrado " + value;
    }
}
