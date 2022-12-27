package baekjoon.bronze.bronzeⅢ.boj25915_연세여사랑한다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(br.readLine());
        int total = 0;
        String yonsei = "ILOVEYONSEI";
        int location = s.charAt(0) - 65;
        for (int i = 0; i < yonsei.length(); i++) {
            int now = (yonsei.charAt(i) - 65);
            int dist = Math.abs(location - now);
            total += dist;
            location = now;
        }
        System.out.println(total);
    }
}
