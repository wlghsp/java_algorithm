package baekjoon.silverⅤ.Boj2581_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean isPrime(int num) {
        if(num == 0 || num == 1) return false;
        for (int i = 2; i*i <= num ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int sum = 0;

        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                min = Math.min(min, i);
                list.add(i);
            }
        }

        if(list.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
