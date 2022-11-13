package baekjoon.bronze.bronzeⅢ.boj2460_지능형기차2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int onBoard = 0;
        int maxPeople = Integer.MIN_VALUE;
        StringTokenizer st;
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            onBoard -= Integer.parseInt(st.nextToken());
            onBoard += Integer.parseInt(st.nextToken());
            maxPeople = Math.max(maxPeople, onBoard);
        }
        System.out.println(maxPeople);
    }
}
