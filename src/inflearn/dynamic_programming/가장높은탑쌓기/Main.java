package inflearn.dynamic_programming.가장높은탑쌓기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Brick {
    int s;
    int h;
    int w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }
}

public class Main {

    static int N;
    static int[] dy;
    static List<Brick> bricks;

    public int solution() {
        dy[0] = bricks.get(0).h;
        int answer = dy[0];

        for (int i = 1; i < N; i++) {
            int maxHeight = 0;
            for (int j = i - 1; j >= 0; j--) {
               if (bricks.get(j).w > bricks.get(i).w && dy[j] > maxHeight) {
                   maxHeight = dy[j];
               }
            }
            dy[i] = maxHeight + bricks.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        bricks = new ArrayList<>();
        dy = new int[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            bricks.add(new Brick(S, H, W));
        }
        bricks.sort((a, b) -> b.s - a.s);

        System.out.println(T.solution());
    }
}
