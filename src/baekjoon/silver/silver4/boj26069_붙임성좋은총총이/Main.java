package baekjoon.silver.silver4.boj26069_붙임성좋은총총이;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static int N;


    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj26069_붙임성좋은총총이/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Set<String> dance = new HashSet<>();
        dance.add("ChongChong");

        int ans = 1;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (dance.contains(a) && !dance.contains(b)) {
                ans++;
                dance.add(b);
            } else if (!dance.contains(a) && dance.contains(b)) {
                ans++;
                dance.add(a);
            }
        }

        System.out.println(ans);

    }
}
