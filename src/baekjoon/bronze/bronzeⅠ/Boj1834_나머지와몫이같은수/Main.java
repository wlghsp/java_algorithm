package baekjoon.bronze.bronzeⅠ.Boj1834_나머지와몫이같은수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long num = 0;
        /*
         그 수는 N의 제곱까지이고, N+1부터 시작, N+1의 배수이다.
         */
        for (long i = n + 1; i < Math.pow(n, 2); i += n + 1) {
            num += i;
        }

        System.out.println(num);
    }
}
