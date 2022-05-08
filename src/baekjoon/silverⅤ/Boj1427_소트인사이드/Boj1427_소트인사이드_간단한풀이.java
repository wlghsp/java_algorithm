package baekjoon.silverⅤ.Boj1427_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj1427_소트인사이드_간단한풀이 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
