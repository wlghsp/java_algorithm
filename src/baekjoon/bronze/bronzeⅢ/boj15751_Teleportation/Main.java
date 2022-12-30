package baekjoon.bronze.bronzeⅢ.boj15751_Teleportation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int xRoad = Math.abs(a - x) + Math.abs(y - b);
        int yRoad = Math.abs(a - y) + Math.abs(x - b);
        int minRoad = Math.min(xRoad, yRoad);
        int direct = Math.abs(a - b);
        System.out.println(Math.min(direct, minRoad));

    }
}
