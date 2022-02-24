package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2864_5와6의차이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String new_a = a, new_b = b;
        new_a = a.replaceAll("6", "5");
        new_b = b.replaceAll("6", "5");
        System.out.print(Integer.parseInt(new_a) + Integer.parseInt(new_b));
        System.out.print(" ");

        new_a = a.replaceAll("5", "6");
        new_b = b.replaceAll("5", "6");
        System.out.print(Integer.parseInt(new_a) + Integer.parseInt(new_b));

    }
}
