package java_study.concurrenthashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TraversingConcurrentHashMap {

    public static void main(String[] args) {
        ConcurrentMap<Integer, String> chmap = new ConcurrentHashMap<>();

        chmap.put(8, "Third");
        chmap.put(6, "Second");
        chmap.put(3, "First");
        chmap.put(11, "Fourth");

        // Create an Iterator over the ConcurrentHashMap
        Iterator<Map.Entry<Integer, String>> itr = chmap.entrySet().iterator();

        // The hasNext() method is used to check if there is a next element
        // The next() method is used to retrieve the next element
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("entry.getKey() = " + entry.getKey() + ", Value = " + entry.getValue());
        }

    }
}
