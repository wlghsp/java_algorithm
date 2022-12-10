package baekjoon.bronze.bronzeⅢ.boj4493_가위바위보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int p1Win = 0;
            int p2Win = 0;
            int tie = 0;

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                if (("R".equals(a) && "S".equals(b)) || ("S".equals(a) && "P".equals(b)) || ("P".equals(a) && "R".equals(b))) {
                    p1Win++;
                } else if (a.equals(b)) {
                    tie++;
                } else {
                    p2Win++;
                }
            }

            if (p1Win > p2Win){
                System.out.println("Player 1");
            } else if (p2Win > p1Win) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }

        }
    }
}
