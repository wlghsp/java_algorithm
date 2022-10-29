package baekjoon.bronze.bronzeⅠ.boj9946_단어퍼즐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            String f = br.readLine();
            String s = br.readLine();
            if (f.equals("END") && s.equals("END")) break;
            char[] a = f.toCharArray();
            char[] b = s.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (new String(a).equals(new String(b))){
                sb.append("Case ").append(i++).append(": same\n");
            } else {
                sb.append("Case ").append(i++).append(": different\n");
            }
        }
        System.out.println(sb);
    }
}
