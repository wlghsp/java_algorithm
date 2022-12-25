package baekjoon.bronze.bronzeⅢ.boj21312_홀짝칵테일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        boolean hasOdd = false;
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] % 2 != 0) hasOdd = true;
        }
        int result = 1;
        if (hasOdd) {
            for (int i = 0; i < 3; i++) {
                if (arr[i] % 2 != 0)
                    result *= arr[i];
            }
        } else {
            for (int i = 0; i < 3; i++) {
                result *= arr[i];
            }
        }
        System.out.println(result);
    }
}
