package baekjoon.silver.silver2.boj18870_좌표압축;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj18870_좌표압축/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 중복 제거 및 정렬
        int[] distinctArr = Arrays.stream(arr).distinct().sorted().toArray();

        // 좌표를 키로 넣고 인덱스가 Xi > Xj를 만족하는 서로 다른 좌표의 갯수
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < distinctArr.length; i++) {
            map.put(distinctArr[i], i);
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
