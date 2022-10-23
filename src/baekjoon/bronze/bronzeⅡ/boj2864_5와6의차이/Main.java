package baekjoon.bronze.bronzeⅡ.boj2864_5와6의차이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        String maxA = a.replace("5", "6");
        String maxB = b.replace("5", "6");
        String minA = a.replace("6", "5");
        String minB = b.replace("6", "5");

        int maxVal = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        int minVal = Integer.parseInt(minA) + Integer.parseInt(minB);
        System.out.println(minVal + " " + maxVal);
    }
}
