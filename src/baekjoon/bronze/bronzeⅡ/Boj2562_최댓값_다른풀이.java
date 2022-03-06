package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Boj2562_최댓값_다른풀이 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 1; i < 10; i++) {
          map.put(Integer.parseInt(br.readLine()),i);
        }
        System.out.println(map.lastEntry().getKey() + "\n"+ map.lastEntry().getValue());

    }
}
