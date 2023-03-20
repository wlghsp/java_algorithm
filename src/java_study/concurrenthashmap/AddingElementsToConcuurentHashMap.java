package java_study.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AddingElementsToConcuurentHashMap {

    public static void main(String[] args) {
        // Creating ConcurrentHashMap
        ConcurrentMap<String, String> my_cmmap = new ConcurrentHashMap<>();


        // Adding elements to the map
        // using put() method
        my_cmmap.put("1", "1");
        my_cmmap.put("2", "1");
        my_cmmap.put("3", "1");
        my_cmmap.put("4", "1");
        my_cmmap.put("5", "1");
        my_cmmap.put("6", "1");

        // Printing the map
        System.out.println("Mappings of my_cmmap = " + my_cmmap);

        // create another concurrentHashMap
        ConcurrentMap<String, String> new_chm = new ConcurrentHashMap<>();

        // copy mappings from my_cmmap to new_chm
        new_chm.putAll(my_cmmap);

        // Displaying the new map
        System.out.println("New mappings are = " + new_chm);

    }
}
