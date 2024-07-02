package baekjoon.silver.silver2.boj24479_알고리즘수업깊이우선탐색1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 100_000 + 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
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

        // 1. graph에 연결 정보 채우기
        for (int i = 0; i < N; i++) graph[i] = new ArrayList<>();


        // 2. 오름차순 정렬

        // 3. dfs (재귀함수 호출)

        // 4. 출력
    }
}
