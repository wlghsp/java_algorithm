package baekjoon.bronze.bronzeⅢ.boj2455_지능형기차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPeople = 0;
        StringTokenizer st;
        int maxPeople = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int off = Integer.parseInt(st.nextToken());
            int on = Integer.parseInt(st.nextToken());
            numberOfPeople += on - off;
            maxPeople = Math.max(numberOfPeople, maxPeople);
        }
        System.out.println(maxPeople);
    }
}
