package baekjoon.gold.gold3.boj2655_가장높은탑쌓기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

    static int N;
    static int[] dy, path;
    static List<Brick> bricks = new ArrayList<>();

    public static int solution() {
        dy[0] = bricks.get(0).h;
        int maxHeight = 0;
        int lastIndex = 0;
        for (int i = 1; i < N; i++) {
            dy[i] = bricks.get(i).h;
            path[i] = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (bricks.get(i).w > bricks.get(j).w && dy[i] < dy[j] + bricks.get(i).h) {
                    dy[i] = dy[j] + bricks.get(i).h;
                    path[i] = j;
                }
            }
            if (dy[i] > maxHeight) {
                maxHeight = dy[i];
                lastIndex = i;
            }
        }

        return lastIndex;
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/gold/gold3/boj2655_가장높은탑쌓기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dy = new int[N];
        path = new int[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            bricks.add(new Brick(i, s, h, w));
        }
        bricks.sort((a, b) -> b.s - a.s);

        int lastIndex = solution();
        List<Integer> result = new ArrayList<>();
        while (lastIndex != 0) {
            result.add(bricks.get(lastIndex).index);
            lastIndex = path[lastIndex];
        }

        Collections.reverse(result);
        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n");
        for (Integer i : result) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);

    }
}

class Brick {
    int index;
    int s;
    int h;
    int w;

    public Brick(int index, int s, int h, int w) {
        this.index = index;
        this.s = s;
        this.h = h;
        this.w = w;
    }
}
