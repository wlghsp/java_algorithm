package baekjoon.bronze.bronzeⅢ.boj11367_ReportCardTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            sb.append(name).append(" ").append(getGrade(score)).append("\n");
        }
        System.out.println(sb);

    }

    private static String getGrade(int score) {
        String grade = "";
        if (score >= 97) {
            grade = "A+";
        } else if (score >= 90 && score <= 96) {
            grade = "A";
        } else if (score >= 87 && score <= 89) {
            grade = "B+";
        } else if (score >= 80 && score <= 86) {
            grade = "B";
        } else if (score >= 77 && score <= 79) {
            grade = "C+";
        } else if (score >= 70 && score <= 76) {
            grade = "C";
        } else if (score >= 67 && score <= 69) {
            grade = "D+";
        } else if (score >= 60 && score <= 66) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;

    }
}
