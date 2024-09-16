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
//        int[] distinctArr = Arrays.stream(arr).distinct().sorted().toArray();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < distinctArr.length; i++) {
//            map.put(distinctArr[i], i);
//        }
        Set<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int num : set) {
            map.put(num, index++);
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
