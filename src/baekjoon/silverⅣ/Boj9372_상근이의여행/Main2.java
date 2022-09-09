package baekjoon.silverⅣ.Boj9372_상근이의여행;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    /*
     최소 신장 트리의 성질을 이용한다. 간선의 갯수는 정점의 갯수 - 1 이다.
     즉 모든 국가가 연결되어 있기 때문에 비행기 종류의 최소 개수는 국가 수 - 1 이다.
     */
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            for (int i = 0; i < m; i++) {
                br.readLine();
            }
            sb.append((n - 1) + "\n");
        }
        System.out.println(sb);
    }
}
