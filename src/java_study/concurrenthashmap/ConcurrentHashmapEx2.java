package java_study.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashmapEx2 {

    public static void main(String[] args) {
        // create an instance of ConcurrentHashMap
        ConcurrentMap<Integer, String> m = new ConcurrentHashMap<>();
        // Adding elements to the map
        m.put(100, "Hello");
        m.put(101, "Geeks");
        m.put(102, "Geeks");

        // Here we can't add Hello because 101 key
        // is already present in ConcurrentHashMap Object
        m.putIfAbsent(101, "Hello");

        // We can remove entry because 101 key
        // is associated with For value
        m.remove(101, "Geeks");

        // Now we can add Hello
        m.putIfAbsent(103, "Hello");

        // We cant replace Hello with For
        m.replace(101, "Hello", "For");
        System.out.println(m);


    }
}
