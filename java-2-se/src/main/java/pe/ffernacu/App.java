package pe.ffernacu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class App implements CommandLineRunner
{
    private final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    private void arraylist(){
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(2);
        list.forEach(element -> log.info("{}", element));
    }

    private void linkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(1);
        list.add(1);
        list.removeFirst();
        list.addFirst(4);
        list.remove(1);
        //list.clear();;
        list.forEach(element -> log.info("{}", element));
    }

    private void arraysSort(){
        int[] arrayInt = {1,4,2,1};
        Arrays.sort(arrayInt);
        log.info("{}", Arrays.toString(arrayInt));
    }

    private void arraysBinarySearch(int value){
        int[] arrayInt = {1,4,2,2,1,3};
        int indice = Arrays.binarySearch(arrayInt, value);
        log.info("indice: {} - valor {}", indice, arrayInt[indice]);
    }

    private void asList(){
        int[] arrayInt = {1,4,2,2,1,3};
        Arrays.asList(arrayInt).forEach(element -> log.info("{}", element));
    }

    /**
     * sin orden
     * el valor de clave repetida se sobreescribe
     * usado para busquedas rapidas y validar sesiones de usuario
     */
    private void hashMap(){

        String sessionId = UUID.randomUUID().toString();

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key1", 1);
        hashMap.put(sessionId, 5);
        hashMap.put("user", 6);
        hashMap.put("client", 3);
        hashMap.put("business", 3);
        hashMap.put("host", 7);

        hashMap.remove("key1");
        hashMap.get("key2");


        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            log.info("{}", entry);
        }

    }

    /**
     * con orden de insercion
     * el valor de clave repetida se sobreescribe
     * usado para historiales y remover datos con menos uso
     */
    private void linkedHashMap(){
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("key1", 1);
        linkedHashMap.put("key", 5);
        linkedHashMap.put("user", 6);
        linkedHashMap.put("client", 3);
        linkedHashMap.put("business", 3);
        linkedHashMap.put("host", 3);

        Integer s = linkedHashMap.get("key1");
        log.info("{}", s);


        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            log.info("{}", entry);
        }

    }

    /**
     * con order por llave
     * el valor de clave repetida se sobreescribe
     * para busqueda por rango de fechas
     */
    private void treeMap(){
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("key1", 1);
        treeMap.put("key", 5);
        treeMap.put("user", 6);
        treeMap.put("client", 3);
        treeMap.put("business", 3);
        treeMap.put("host", 3);

        log.info("{}","-".repeat(10));

        for(Map.Entry<String, Integer> entry : treeMap.entrySet()){
            log.info("{}", entry);
        }
        log.info("{}","-".repeat(10));

        log.info("{}",treeMap.firstEntry());
        log.info("{}",treeMap.lastEntry());

        log.info("{}","-".repeat(10));

        log.info("{}",treeMap.tailMap("client"));
    }

    private void hashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("value1");
        hashSet.add("value2");
        hashSet.add("value3");
        hashSet.add("value4");

        log.info("{}","-".repeat(10));
        hashSet.forEach(element -> log.info("{}", element));
    }

    private void linkedHashSet(){
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("value1");
        linkedHashSet.add("value2");
        linkedHashSet.add("value3");
        linkedHashSet.add("value4");

        log.info("{}","-".repeat(10));
        linkedHashSet.forEach(element -> log.info("{}", element));

    }

    private void treeSet(){
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("client1");
        treeSet.add("state2");
        treeSet.add("client3");
        treeSet.add("state3");

        log.info("{}","-".repeat(10));
        treeSet.forEach(element -> log.info("{}", element));

        log.info("{}","-".repeat(10));
        treeSet.addAll(List.of("client2","state1"));
        treeSet.forEach(element -> log.info("{}", element));

        log.info("{}","-".repeat(10));
        List<String> list = new ArrayList<>();
        list.add("state4");
        treeSet.addAll(list);
        treeSet.forEach(element -> log.info("{}", element));

    }

    @Override
    public void run(String... args) throws Exception {
        //treeSet();
        //linkedHashSet();
        //treeMap();
        //linkedHashMap();
        //hashMap();
        //asList();
        //arraysSort();
        //linkedList();
        //arraylist();
        //arraysBinarySearch(3);
    }
}
