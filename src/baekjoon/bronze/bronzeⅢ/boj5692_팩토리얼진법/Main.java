package baekjoon.bronze.bronzeⅢ.boj5692_팩토리얼진법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] fact = new int[]{1, 2, 6, 24, 120};
        while (true) {
            String num = br.readLine();
            if ("0".equals(num)) break;
            int result = 0;
            for (int i = 0; i < num.length(); i++) {
                result += (num.charAt(i) - 48) * fact[num.length() - i - 1];
            }
            System.out.println(result);
        }

    }

//    public static int fact(int n) {
//        if (n <= 1) {
//            return 1;
//        }
//        return n * fact(n - 1);
//    }
}
