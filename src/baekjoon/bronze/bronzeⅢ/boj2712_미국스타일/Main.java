package baekjoon.bronze.bronzeⅢ.boj2712_미국스타일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double val = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();

            if ("kg".equals(unit)) {
                // kg -> lb
                val *= 2.2046;
                unit = "lb";
            } else if ("lb".equals(unit)) {
                // lb -> kg
                val *= 0.4536;
                unit = "kg";
            } else if ("l".equals(unit)) {
                // l -> g
                val *= 0.2642;
                unit = "g";
            } else if ("g".equals(unit)) {
                // g -> l
                val *= 3.7854;
                unit = "l";
            }

            System.out.printf("%.4f %s\n", val, unit);
        }
    }
}
