package baekjoon.silverⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1978_소수찾기 {

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        // 에라토스테네스의 체, 그 수의 제곱근까지만 확인해주면 됨.
        int lim = (int) Math.sqrt(num);

        for (int i = 2; i <= lim; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) cnt++;
        }

        System.out.println(cnt);
    }
}
