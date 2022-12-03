package baekjoon.silverⅤ.Boj1427_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 선택 정렬로 풀이하기
        String n = br.readLine();
        int[] arr = new int[n.length()];

        for (int i = 0; i < n.length(); i++) {
            arr[i] = Integer.parseInt(n.substring(i, i + 1));
        }

        for (int i = 0; i < n.length(); i++) {
            int max = i;
            for (int j = i+1; j < n.length(); j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            if (arr[i] < arr[max]) {
                int tmp = arr[i];
                arr[i] = arr[max];
                arr[max] = tmp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
