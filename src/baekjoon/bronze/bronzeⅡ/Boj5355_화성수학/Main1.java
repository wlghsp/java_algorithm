package baekjoon.bronze.bronzeⅡ.Boj5355_화성수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] s = br.readLine().split(" ");
            double d = Double.parseDouble(s[0]);
            for (int i = 1; i < s.length; i++) {
                if (s[i].equals("@")) d *= 3;
                else if (s[i].equals("%")) d += 5;
                else if (s[i].equals("#")) d -= 7;
            }
            System.out.printf("%.2f\n", d);
        }
    }
}
