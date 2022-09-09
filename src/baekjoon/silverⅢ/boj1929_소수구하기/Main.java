package baekjoon.silverⅢ.boj1929_소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        // 소수 판별 배열 n까지 나타내기 위해 범위는 n+1로
        // 소수 판별은 꼭 boolean형을 사용하지 않고 int형이나 String형 같이 다른 자료형을 사용해도 된다.
        boolean[] arr = new boolean[n + 1];
        StringBuilder sb = new StringBuilder();
        // 0과 1은 소수가 아니다.
        arr[0] = true;
        arr[1] = true;
        // 문제에서 말한 제곱해서 n을 넘지 않을때까지만 소수의 배수를 제외해 주면 된다.
        for (int i = 2; i*i <= n; i++) {
            // 소수 일 때
            if (!arr[i]) {
                // j에는 소수의 배수들이 들어와야하기 때문에 아래 조건이 들어간다.
                // i * i인  4부터 시작하고 거기에 계속 i를 더하면 배수가 나온다.
                for (int j = i * i; j <= n; j+= i) {
                    // 소수의 배수들에는 true를 저장
                    arr[j] = true;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (!arr[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
