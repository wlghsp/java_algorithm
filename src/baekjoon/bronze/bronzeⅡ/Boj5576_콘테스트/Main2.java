package baekjoon.bronze.bronzeⅡ.Boj5576_콘테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10; i++) {
            b[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int aSum = a[a.length - 1] + a[a.length - 2] + a[a.length - 3];
        int bSum = b[b.length - 1] + b[b.length - 2] + b[b.length - 3];
        System.out.println(aSum + " " + bSum);

    }
}
