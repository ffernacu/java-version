package pe.ffernacu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.List;
import java.util.function.*;


@SpringBootApplication
public class Main implements CommandLineRunner{

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    Function<Integer, Integer> addIntegerFunction = number -> number + 1;

    private void functionApply(Integer number){
        log.info("{}", addIntegerFunction.apply(number));
    }

    private void functionApply2(Integer number){
        List<Integer> integerList = List.of(number, number + 1, number + 2);
        integerList.stream()
                .map(addIntegerFunction)
                .toList()
                .forEach(e -> log.info("{}",e));
    }

    Function<Integer, Integer> multipleIntegerFunction = number -> number * 10;

    private void functionAndThenApply(Integer number){
        log.info("{}", addIntegerFunction.andThen(multipleIntegerFunction).apply(number));
    }

    private void biFunctionApply(Integer arg1, Integer arg2){
        BiFunction<Integer,Integer,String> concatTwoValues = (a, b) -> {
            log.info("logic funcional");
            return a+b.toString();
        };
        log.info(concatTwoValues.apply(arg1,arg2));
    }

    private void consumerAccept(Integer arg1){
        Consumer<Integer> processData = a -> log.info("{}",a+1);
        processData.accept(arg1);
    }

    private void consumerAccept2(List<Model> list){
        list.forEach(model -> {
            model.setName("name");
            log.info("{}", model);
        });
    }

    private boolean predicate(Integer value){
        Predicate<Integer> validateValue = a -> {
            var result = a > 10;
            log.info("{}", result);
            return result;
        };
        return validateValue.test(value);
    }

    private List<Integer> predicateFilter(List<Integer> list){
        var result = list.stream().filter(integer -> integer > 10).toList();
        log.info("{}", result);
        return result;
    }

    private boolean predicateFilter2(String value){
        Predicate<String> validStartLetter = argument -> argument.startsWith("a");
        Predicate<String> validIsBlank = argument -> !argument.isBlank();
        Predicate<String> validEndLetter = argument -> argument.endsWith("n");
        var result = validStartLetter.and(validIsBlank).and(validEndLetter).test(value);
        log.info("{}", result);
        return result;
    }

    private void bynaryOperator(Integer a , Integer b){
        BinaryOperator<Integer> cal = (argument, argument2) -> {
          if(argument > 0 && argument2 > 0){
              log.info("argumentos positivos");
              return argument + argument2;
          }
          else return 0;
        };
        log.info("{}", cal.apply(a,b));
    }

    @Override
    public void run(String... args){
        //bynaryOperator(1,2);
        //predicateFilter2("adrian");
        //predicateFilter(List.of(1,10,11));
        //predicate(11);
        //consumerAccept2(List.of(new Model(1,null)));
        //consumerAccept(123);
        //biFunctionApply(5,6);
        //functionApply(10);
        //functionApply2(1);
        //functionAndThenApply(10);
    }

}