package oneday_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10818_최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -10000001;
        int min = 10000001;
        for (int i = 0; i < n; i++) {
            int temp  = Integer.parseInt(st.nextToken());
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min+ " " + max);
    }
}
