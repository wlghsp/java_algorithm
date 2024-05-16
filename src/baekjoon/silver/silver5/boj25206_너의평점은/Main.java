package baekjoon.silver.silver5.boj25206_너의평점은;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static final int SUBJECTS_CNT = 20;
    static String[] alphabets = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
    static double[] scores = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> map = new HashMap<>();
        for (int i = 0; i < alphabets.length; i++) {
            map.put(alphabets[i], scores[i]);
        }
        double total = 0.0;
        double cnt = 0.0;
        StringTokenizer st;
        for (int i = 0; i < SUBJECTS_CNT; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String alphabet = st.nextToken();

            if (alphabet.equals("P")) continue;

            total += map.get(alphabet) * grade;
            cnt += grade;
        }

        System.out.printf("%.6f", total / cnt);

    }
}
