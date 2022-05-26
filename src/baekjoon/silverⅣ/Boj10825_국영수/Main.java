package baekjoon.silverⅣ.Boj10825_국영수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[][] students = new String[N][4];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            students[i][0] = s[1];
            students[i][1] = s[2];
            students[i][2] = s[3];
            students[i][3] = s[0];
        }

        /*
        1. 국어점수 내림차순
        2. 영어점수 오름차순
        3. 수학점수 내림차순
        4. 이름 사전 순 오름차순
         */

        Arrays.sort(students,(o1, o2) -> {
            if (Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {

                if (Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
                    if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
                        return o1[3].compareTo(o2[3]);
                    }
                    return Integer.parseInt(o2[2]) - Integer.parseInt(o1[2]);
                }
                return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
            }
            return Integer.parseInt(o2[0]) - Integer.parseInt(o1[0]);
        });

        StringBuilder sb = new StringBuilder();
        for (String[] s : students) {
            sb.append(s[3]).append('\n');
        }
        System.out.println(sb);
    }
}
