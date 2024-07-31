package baekjoon.silver.silver2.boj10552_dom;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N, M, P;
    static boolean[] visited;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj10552_dom/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> hateDic = new HashMap<>();
        visited = new boolean[N];
        board = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int loveC = Integer.parseInt(st.nextToken());
            int hateC = Integer.parseInt(st.nextToken());
            if (!hateDic.containsKey(hateC)) {
                // 싫어하는 채널을 키, 사람을 값으로 담음
                hateDic.put(hateC, i);
            }
            board[i][0] = loveC;
            board[i][1] = hateC;
        }

        int count = 0;
        while (true) {
            Integer hatePerson = hateDic.get(P);

            // 싫어하는 사람이 없으면 채널을 바꾼 횟수 출력하고 반복문 종료
            if (hatePerson == null) {
                System.out.println(count);
                break;
            }
            // 같은 사람을 다시 방문할 경우 사이클 발생
            if (visited[hatePerson]) {
                System.out.println(-1);
                break;
            } else {
                visited[hatePerson] = true;
            }

            P = board[hatePerson][0];

            count++;
        }


    }

}
