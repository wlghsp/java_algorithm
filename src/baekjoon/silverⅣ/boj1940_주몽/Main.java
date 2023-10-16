package baekjoon.silverⅣ.boj1940_주몽;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ingredients = new int[N];
        for (int i = 0; i < N; i++) {
            ingredients[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = N - 1;
        int cnt = 0;

        Arrays.sort(ingredients);

        while (start < end) {
            int sum = ingredients[start] + ingredients[end];
            if (M == sum) {
                cnt++;
                start++;
                end--;
            } else if (M > sum) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(cnt);


    }
}
