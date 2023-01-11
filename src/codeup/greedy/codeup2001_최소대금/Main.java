package codeup.greedy.codeup2001_최소대금;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minPasta = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int p = Integer.parseInt(br.readLine());
            minPasta = Math.min(minPasta, p);
        }
        int minJuice = Integer.MAX_VALUE;
        for (int i = 0; i < 2; i++) {
            int p = Integer.parseInt(br.readLine());
            minJuice = Math.min(minJuice, p);
        }
        System.out.printf("%.1f", (minJuice + minPasta) * 1.1);
    }
}
