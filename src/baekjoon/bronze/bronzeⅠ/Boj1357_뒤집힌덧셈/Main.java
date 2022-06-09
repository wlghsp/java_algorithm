package baekjoon.bronze.bronzeⅠ.Boj1357_뒤집힌덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int rev(int x) {
        int answer = 0;
        while (x != 0) {
            answer = answer * 10 + x %  10;
            x /= 10;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int sum = rev(x) + rev(y);
        System.out.println(rev(sum));
    }
}
