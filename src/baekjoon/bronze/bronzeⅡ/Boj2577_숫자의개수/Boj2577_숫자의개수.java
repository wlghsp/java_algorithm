package baekjoon.bronze.bronzeⅡ.Boj2577_숫자의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2577_숫자의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String result = String.valueOf(a*b*c);

        int[] arr = new int[10];

        for (int i = 0; i < result.length(); i++) arr[(result.charAt(i)- '0')]++;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {sb.append(arr[i]).append("\n");}

        System.out.println(sb);

    }
}
