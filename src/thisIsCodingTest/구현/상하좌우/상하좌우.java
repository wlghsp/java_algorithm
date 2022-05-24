package thisIsCodingTest.구현.상하좌우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 상하좌우 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 1, y = 1;
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Character> plans = new ArrayList<>();
        while (st.hasMoreTokens()) {
            plans.add(st.nextToken().charAt(0));
        }

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] move_types = {'L', 'R', 'U', 'D'};
        int nx = 0, ny = 0;
        for (Character plan : plans) {
            for (int i = 0; i < move_types.length; i++) {
                if (plan == move_types[i]) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                }
            }
            if (nx < 1 || ny < 1|| nx > N || ny > N) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);

    }
}
/*
5
R R R U D D
 */