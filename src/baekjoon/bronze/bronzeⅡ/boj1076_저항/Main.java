package baekjoon.bronze.bronzeⅡ.boj1076_저항;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int num = getIdx(a) * 10 + getIdx(b);
        int idx = getIdx(c);
        System.out.println((long) (num * Math.pow(10, idx)));
    }

    private static int getIdx(String a) {
        int result = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(a)) result = i;
        }
        return result;
    }

}
