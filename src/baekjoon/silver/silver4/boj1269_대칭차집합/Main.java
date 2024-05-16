package baekjoon.silver.silver4.boj1269_대칭차집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int ans = 0;
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            ans += !aSet.contains(num) ? 1 : 0;
            bSet.add(num);
        }

        for (Integer integer : aSet) {
            ans += !bSet.contains(integer) ? 1 : 0;
        }
        System.out.println(ans);

    }
}
