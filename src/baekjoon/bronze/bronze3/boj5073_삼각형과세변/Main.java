package baekjoon.bronze.bronze3.boj5073_삼각형과세변;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String s = br.readLine();
            if (s.equals("0 0 0")) break;

            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

//            if (a == b) {
//                if (a == b && b == c) {
//                    System.out.println("Equilateral");
//                } else if (a == b || b == c || c == a) {
//                    System.out.println("Isosceles");
//                } else {
//                    System.out.println("Scalene");
//                }
//            } else {
//                System.out.println("Invalid");
//            }
        }


    }
}
