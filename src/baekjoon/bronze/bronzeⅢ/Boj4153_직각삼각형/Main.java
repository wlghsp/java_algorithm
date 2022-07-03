package baekjoon.bronze.bronzeⅢ.Boj4153_직각삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if ((a == 0) && (b==0) && (c==0)) break;
            /*
             a^2 = b^2 + b^2을 만족하는지 체크
             Math.sqrt() 로 제곱근을 안 구하는 이유는 double 형으로 제곱근을 반환하는 과정 중에
             일정 소수점 이하로 가면 소수값이 달라질 수 있다.
             */

            if ((a*a + b*b) == (c * c)) {
                System.out.println("right");
            }
            else if ((a*a + c*c) == (b * b)) {
                System.out.println("right");
            }
            else if ((b*b + c*c) == (a * a)) {
                System.out.println("right");
            }

            else {
                System.out.println("wrong");
            }
        }
    }
}
