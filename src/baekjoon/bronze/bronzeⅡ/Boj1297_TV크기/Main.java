package baekjoon.bronze.bronzeⅡ.Boj1297_TV크기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        double r = d / Math.pow((Math.pow(h, 2) + Math.pow(w, 2)), 0.5);

        int height = (int) Math.floor(r * h);
        int width = (int) Math.floor(r * w);

        System.out.println(height + " " + width);
    }
}
