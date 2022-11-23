package real_tests.satrec;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(calc(1));
        System.out.println(calc(2020));
        System.out.println(calc(-2021));
    }
    public static String calc(int number) {
        String num = String.valueOf(number);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            char n = num.charAt(i);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        if (map.size() > 2) {
            return "n";
        } else {
            return "y";
        }
    }
}
