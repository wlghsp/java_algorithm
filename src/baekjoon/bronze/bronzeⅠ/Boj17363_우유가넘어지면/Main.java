package baekjoon.bronze.bronzeⅠ.Boj17363_우유가넘어지면;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] input = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                input[i][j] = line.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = M-1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                sb.append(reverse(input[j][i]));
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }

    private static char reverse(char c) {
        if (c== '-') return '|';
        if (c== '|') return '-';
        if (c== '/') return '\\';
        if (c== '\\') return '/';
        if (c== '^') return '<';
        if (c== '<') return 'v';
        if (c== 'v') return '>';
        if (c== '>') return '^';
        return c;
    }


}
