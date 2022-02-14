package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2908_상수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        // 문자열 reverse
        StringBuffer sb1 = new StringBuffer(a);
        StringBuffer sb2 = new StringBuffer(b);
        // StringBuffer 클래스는 String을 다루는 클래스


        // reverse() 메소드는 StringBuffer 객체를 리턴하기 때문에
        // toString() 메소드를 사용하여 String으로 변환
        int int_a = Integer.parseInt(sb1.reverse().toString());
        int int_b = Integer.parseInt(sb2.reverse().toString());

        System.out.println(int_a > int_b ? int_a : int_b);

    }
}
