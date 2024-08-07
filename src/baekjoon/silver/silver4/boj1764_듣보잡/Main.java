package baekjoon.silver.silver4.boj1764_듣보잡;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj1764_듣보잡/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> neverHeard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            neverHeard.add(br.readLine());
        }
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (neverHeard.contains(name)) {
                answer.add(name);
            }
        }

        System.out.println(answer.size());
        answer.sort(Comparator.naturalOrder());
        answer.forEach(System.out::println);
    }
}
