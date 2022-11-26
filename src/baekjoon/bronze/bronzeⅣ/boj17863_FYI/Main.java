package baekjoon.bronze.bronzeⅣ.boj17863_FYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().substring(0, 3);
        System.out.println("555".equals(s) ? "YES": "NO");
    }
}
