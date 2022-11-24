package baekjoon.bronze.bronzeⅣ.boj25191_치킨댄스를추는곰곰이를본임스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int chickens = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cola = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        int cnt = cola / 2 + beer;
        System.out.println(Math.min(chickens, cnt));

    }
}
