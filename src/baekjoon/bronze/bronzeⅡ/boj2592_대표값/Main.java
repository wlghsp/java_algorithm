package baekjoon.bronze.bronzeⅡ.boj2592_대표값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int average = sum / 10;
        int maxVal = Integer.MIN_VALUE;
        for (Integer i : map.values()) {
            if (maxVal < i) maxVal = i;
        }
        int mode = 0;
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            if (en.getValue() == maxVal) mode = en.getKey();
        }
        System.out.println(average);
        System.out.println(mode);
    }
}
