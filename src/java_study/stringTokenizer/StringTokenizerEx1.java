package java_study.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

    public static void main(String[] args) {
        String str = "양햄찌 블로그 jhnyang tistroy";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}
