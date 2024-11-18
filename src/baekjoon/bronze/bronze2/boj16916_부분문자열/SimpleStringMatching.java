package baekjoon.bronze.bronze2.boj16916_부분문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleStringMatching {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        System.out.println(findString(s1, s2));

    }

    private static int findString(String parent, String pattern) {
        int n1 = parent.length();
        int n2 = pattern.length();

        for (int i = 0; i <= n1 - n2; i++) {
            boolean flag = true;

            for (int j = 0; j < n2; j++) {
                if (parent.charAt(i + j) != pattern.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return 1;
            }
        }

        return 0;
    }
}
