package baekjoon.bronze.bronzeⅢ.boj5342_Billing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Double> map = new HashMap<>();
        map.put("Paper", 57.99);
        map.put("Printer", 120.50);
        map.put("Planners", 31.25);
        map.put("Binders", 22.50);
        map.put("Calendar", 10.95);
        map.put("Notebooks", 11.20);
        map.put("Ink", 66.95);
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        double total = 0.00;
        while (true) {
            String item = br.readLine();
            if (item.equals("EOI")) break;
            total += map.get(item);
        }
        sb.append(total);
        System.out.println(sb);
    }
}
