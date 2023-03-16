package baekjoon.bronze.bronzeⅠ.boj1296_팀이름정하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1 {

    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yondu = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] teams = new String[n];
        for (int i = 0; i < n; i++) {
            teams[i] = br.readLine();
        }
        Arrays.sort(teams);
        int maxIdx = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr = new int[4];
            countAlphas(yondu);
            countAlphas(teams[i]);
            int probability = ((arr[0]+arr[1]) * (arr[0] + arr[2]) * (arr[0] + arr[3])
            * (arr[1] + arr[2]) * (arr[1] + arr[3]) * (arr[2] + arr[3])) % 100;
            if (probability > max) {
                max = probability;
                maxIdx = i;
            }
        }

        System.out.println(teams[maxIdx]);
    }

    private static void countAlphas(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'L') arr[0]++;
            else if (c == 'O') arr[1]++;
            else if (c == 'V') arr[2]++;
            else if (c == 'E') arr[3]++;
        }
    }
}
