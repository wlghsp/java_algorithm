package java_study.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx3 {
    public static void main(String[] args) {
        String str = "IT 블로그 추천-양햄찌블로그:jhnyang.tistory.com";
        StringTokenizer st = new StringTokenizer(str, "-:");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
