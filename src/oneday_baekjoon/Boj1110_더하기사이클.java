package oneday_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1110_더하기사이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int original = n;
        int cycle= 0;
        while(true) {
            n = (n%10)*10 + (((n/10) +(n%10)) %10);
            cycle++;
            if (original == n) break;
        }
        System.out.println(cycle);
    }
}
