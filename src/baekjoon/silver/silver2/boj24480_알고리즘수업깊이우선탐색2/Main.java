package baekjoon.silver.silver2.boj24480_알고리즘수업깊이우선탐색2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 1000000 + 10;
    static ArrayList<Integer>[] graph;
    static int N, M, R;
    static int[] answer;
    static int order;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj24479_알고리즘수업깊이우선탐색1/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        graph = new ArrayList[MAX];
        answer = new int[MAX];

        // 1. graph에 연결 정보 채우기
        for (int i = 0; i <= N; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        // 2. 내림차순 정렬
        for (int i = 0; i <= N; i++) {
            graph[i].sort(Comparator.reverseOrder());
        }

        // 3. dfs (재귀함수 호출)
        dfs(R);

        // 4. 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(answer[i]).append(System.lineSeparator());
        }

        System.out.println(sb);

    }

    private static void dfs(int i) {
        order++;
        answer[i] = order;

        for (Integer num : graph[i]) {
            if (answer[num] == 0) {
                dfs(num);
            }
        }
    }
}
