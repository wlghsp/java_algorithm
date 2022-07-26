package baekjoon.bronze.bronzeⅡ.Boj5355_화성수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String[] line = br.readLine().split(" ");
            double num = Double.parseDouble(line[0]);
            for (int j = 1; j < line.length; j++) {
                if (line[j].equals("@")) num *= 3;
                else if (line[j].equals("%")) num += 5;
                else if (line[j].equals("#")) num -= 7;
            }
            sb.append(String.format("%.2f", num)).append("\n");
        }
        System.out.println(sb);

    }
}
