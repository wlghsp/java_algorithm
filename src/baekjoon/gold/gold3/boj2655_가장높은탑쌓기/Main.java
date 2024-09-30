package baekjoon.gold.gold3.boj2655_가장높은탑쌓기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int N;
    static int[] dy;
    static List<Brick> bricks = new ArrayList<>();

    public static int solution() {
        int maxHeight = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if (bricks.get(i).w > bricks.get(j).w && dy[j] + bricks.get(i).h > dy[i]) {
                    dy[i] = dy[j] + bricks.get(i).h;
                }
            }
            maxHeight = Math.max(maxHeight, dy[i]);
        }

        return maxHeight;
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/gold/gold3/boj2655_가장높은탑쌓기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dy = new int[N + 1];
        bricks.add(new Brick(0, 0, 0, 0));
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            bricks.add(new Brick(i, s, h, w));
        }
        bricks.sort(Comparator.comparingInt(a -> a.s));

        int maxHeight = solution();
        Stack<Integer> stack = new Stack<>();
        while (N > 0) {
            if (maxHeight == dy[N]) {
                stack.push(bricks.get(N).index);
                maxHeight -= bricks.get(N).h;
            }
            N--;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(stack.size()).append("\n");
        while (!stack.isEmpty())
            sb.append(stack.pop()).append("\n");
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
