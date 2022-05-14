package baekjoon.silverⅣ.Boj1764_듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>();
        // set에 포함여부 확인하고 list에 담아준다.
        for (int i = 0; i < M; i++) {
            String tmp = br.readLine();
            if (set.contains(tmp)) {
                list.add(tmp);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');
        for (String s : list) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}