package baekjoon.silver.silver5.boj1475_방번호;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj1475_방번호/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] arr = new int[10];
        for (char c : n.toCharArray()) {
            int num = c - '0';
            if (num == 9) {
                arr[6]++;
            } else {
                arr[num]++;
            }
        }

        // 6과 9는 같으므로 대체 가능하므로 2로 나누며, 홀수일 경우 1세트 더 필요
        arr[6] = arr[6] / 2 + arr[6] % 2;

        int max = 0;

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        System.out.println(max);
    }
}
