package pe.ffernacu.service;

public class ProviderServiceImpl extends UserAbstractService{
    @Override
    public String validUser(String value) {
        return "provider validated "+ value;
    }
}
