package java_study.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashmapEx1 {

    public static void main(String[] args) {
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        // Adding elements to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("map.size() = " + map.size());

        // Getting values from the map
        int valueA = map.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the map
        map.remove("B");
        System.out.println("map.size() = " + map.size());

    }
}
