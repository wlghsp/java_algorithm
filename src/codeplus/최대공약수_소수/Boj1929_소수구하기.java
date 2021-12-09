package codeplus.최대공약수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1929_소수구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] check = new boolean[n + 1];
        check[0] = check[1] = true;

        for (int i = 2; i*i <= n; i++) {
            if (check[i] == true) { // i가 true이면 지워졌음.
                continue;
            }
            for (int j = i+i; j <= n; j+=i) {  // i의 배수들을 true로 바꿔서 배수들을 지웠다고 표시함.
                check[j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (check[i] == false) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);


    }
}
