package pe.ffernacu.service;

public class CustomerServiceImpl extends UserAbstractService implements ICustomerService{

    @Override
    public String validUser(String value) {
        return "usuario validado " + value;
    }

    @Override
    public String saveCustomer(String value) {
        return imprimirUser(value);
    }
}
