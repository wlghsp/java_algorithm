package codeplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj17427_약수의합2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long ans = 0;

        for (int i = 1; i <= n; i++) {
            ans += (n/i) * i;
        }

        System.out.println(ans);
    }

}
