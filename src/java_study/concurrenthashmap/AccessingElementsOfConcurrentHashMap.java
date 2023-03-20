package java_study.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AccessingElementsOfConcurrentHashMap {


    public static void main(String[] args) {
        ConcurrentMap<Integer, String> chm = new ConcurrentHashMap<>();

        chm.put(100, "Geeks");
        chm.put(101, "for");
        chm.put(102, "Geeks");
        chm.put(103, "Contribute");

        // Displaying the HashMap
        System.out.println("The Mappings are: ");
        System.out.println(chm);

        // Display the value of 100
        System.out.println("The Value associated to " + "100 is : " + chm.get(100));

        // Getting the value of 103
        System.out.println("The Value associated to " + "103 is : " + chm.get(103));
    }
}
