package pe.ffernacu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.ffernacu.service.CustomerServiceImpl;
import pe.ffernacu.service.ProviderServiceImpl;

@SpringBootApplication
public class App implements CommandLineRunner
{
    private final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        var result1 = customerService.validUser("user1");
        log.info("{}", result1);
        var result2 = customerService.saveCustomer("user2");
        log.info("{}", result2);
        ProviderServiceImpl providerService = new ProviderServiceImpl();
        var result3 = providerService.validUser("provider1");
        log.info("{}", result3);
    }
}
