package pe.ffernacu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.ffernacu.service.CustomerServiceImpl;
import pe.ffernacu.service.ProviderServiceImpl;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

@SpringBootApplication
public class App implements CommandLineRunner
{
    private final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }


    private boolean validInteger(Integer value1, Integer value2){
          boolean valid = (value1+value2 == 1) || (value1==1 || value2==1);
          log.info("{}", valid);
          return valid;
    }

    private boolean checkMultiplesOptimized(Integer value){
        boolean result = value % 7 == 0 || value % 5 == 0;
        log.info("{}", result);
        return result;
    }

    private boolean isInRangeAndEven(int value){
        var result =  value % 2 == 0 && value >=10 && value <= 50;
        log.info("{}", result);
        return result;
    }

    private boolean isValidUsername(String value){
        var result = value !=null && value.length() > 5 && !value.contains("admin");
        log.info("{}", result);
        return result;
    }

    private boolean canAccessFeature(boolean isAuthenticated  ,boolean hasPremiumSubscription ){
        boolean IS_ADMIN = true;
        var result =  isAuthenticated && (hasPremiumSubscription || IS_ADMIN);
        log.info("{}", result);
        return result;
    }

    @Override
    public void run(String... args) throws Exception {
        isValidUsername("admin");
        //isInRangeAndEven(2);
        //checkMultiplesOptimized(15);
        //validInteger(3,-2);
    }
}
