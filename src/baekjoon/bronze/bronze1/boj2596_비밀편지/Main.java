package baekjoon.bronze.bronze1.boj2596_비밀편지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H"};
    static String[] nums = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = new String[N];
        int index = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = s.substring(index, index + 6);
            index += 6;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < alphabets.length; j++) {
                int diffCnt = getDiffCnt(arr[i], nums[j]);

                if (diffCnt >= 2) continue;

                if (min > diffCnt) {
                    min = diffCnt;
                    minIndex = j;
                    flag = true;
                }
            }

            if (!flag) {
                System.out.println(i + 1);
                return;
            } else {
                sb.append(alphabets[minIndex]);
            }
        }

        System.out.println(sb);

    }

    private static int getDiffCnt(String aStr, String bStr) {
        char[] a = aStr.toCharArray();
        char[] b = bStr.toCharArray();
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) cnt++;
        }
        return cnt;
    }
}
