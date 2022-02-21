package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1076_저항 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        int a = Arrays.asList(colors).indexOf(br.readLine()) * 10;
        int b = Arrays.asList(colors).indexOf(br.readLine());
        int c = Arrays.asList(colors).indexOf(br.readLine());

        int front = a + b;
        long result = (long)(front * Math.pow(10, c));
        System.out.println(result);
    }
}
