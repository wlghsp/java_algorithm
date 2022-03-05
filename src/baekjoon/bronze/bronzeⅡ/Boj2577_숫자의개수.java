package baekjoon.bronze.bronzeⅡ;

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
        int count = 0;
        int[] arr = new int[9];

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0') {
                count++;
            } else {
                arr[(result.charAt(i)- '0') -1]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count + "\n");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);

    }
}
