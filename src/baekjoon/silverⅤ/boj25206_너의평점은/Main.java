package baekjoon.silverⅤ.boj25206_너의평점은;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static final int SUBJECT_CNTS = 20;

    static String[] a = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
    static double[] b = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

    static Map<String, Double> map = new HashMap<>();

    public static void makeMap() {
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], b[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        makeMap();
        StringTokenizer st;
        double hakjumTotal = 0.0;
        double total = 0.0;
        for (int i = 0; i < SUBJECT_CNTS; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (!grade.equals("P")) {
                total += map.get(grade) * score;
                hakjumTotal += score;
            }
        }
        System.out.printf("%.6f",(total / hakjumTotal));
    }
}
