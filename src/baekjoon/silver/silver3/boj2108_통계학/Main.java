package baekjoon.silver.silver3.boj2108_통계학;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj2108_통계학/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 1. N개의 수들의 합을 N으로 나눈 값
        double avg = Arrays.stream(arr)
                .average()
                .orElse(0);
        System.out.println(Math.round(avg));

        // 2. N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        Arrays.sort(arr);
        System.out.println(arr[arr.length / 2]);

        // 3. 최빈값 (복수 있을 경우 두 번째로 작은 값 출력)

        if (N == 1) {
            System.out.println(arr[0]);
        } else {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int maxFrequency = Collections.max(map.values());
            List<Integer> modeList = new ArrayList<>();
            // 가장 큰 빈도를 구하고 빈도와 일치하는 키값들을 리스트에 담아 정렬하고 빈도가 같은 숫자가 2개 이상이면 두 번째 작은 값 출력
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == maxFrequency) {
                    modeList.add(entry.getKey());
                }
            }
            Collections.sort(modeList);
            // 최빈값 중 두 번째로 작은 값 출력
            System.out.println(modeList.size() > 1 ? modeList.get(1) : modeList.get(0));
        }

        // 4. 최댓값과 최솟값의 차이
        System.out.println(arr[arr.length - 1] - arr[0]);
    }
}
