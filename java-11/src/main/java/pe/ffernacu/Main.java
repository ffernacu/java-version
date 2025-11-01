package pe.ffernacu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Main implements CommandLineRunner{

    private final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    private void isBlank(){
        String texto = "       ";
        boolean result = texto.isBlank() ? true : false;
        log.info("{}", result);
    }

    private void lines(){
        String texto = "Línea uno\nLínea dos\nLínea tres";

        var result = texto.lines().collect(Collectors.toList());
        log.info("{}", result);
    }

    private void repeat(){
        String texto = "repetir texto ";
        String result = texto.repeat(5);
        log.info(result);
    }

    private void var(){
        var result= new HashMap<String, List<Integer>>();
        result.put("key",List.of(1,2,3));
        log.info("{}", result);

        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        var nombres = List.of("Ana", "Pedro", "Sara");
        for (var nombre : nombres) {
            System.out.println(nombre);
        }


    }

    @Override
    public void run(String... args) throws Exception {
        var();
        repeat();
        lines();
        isBlank();
        writeString();
        readString();
    }

    private void writeString() throws IOException {
        Path filePath = Paths.get("test.txt");
        String contenido = "ejemplo de texto con writeString";

        Files.writeString(filePath, contenido);
        System.out.println("Archivo 'ejemplo.txt' escrito con exito.");
    }

    private void readString() throws IOException {
        Path filePath = Paths.get("test.txt");
        String result = Files.readString(filePath);
        System.out.println("Contenido leido del archivo");
        log.info("{}", result);
    }


}