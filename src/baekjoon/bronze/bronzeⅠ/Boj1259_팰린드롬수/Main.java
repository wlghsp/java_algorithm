package baekjoon.bronze.bronzeⅠ.Boj1259_팰린드롬수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String num = br.readLine();
            if (num.equals("0")) break;
            StringBuilder sb = new StringBuilder(num);
            System.out.println(sb.reverse().toString().equals(num) ? "yes": "no");
        }
    }
}
