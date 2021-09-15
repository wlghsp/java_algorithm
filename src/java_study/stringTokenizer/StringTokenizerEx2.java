package java_study.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String str = "문!자!열";

        StringTokenizer st = new StringTokenizer(str, "!", true);

        int i = 1;

        while(st.hasMoreTokens()) { //다음 토큰이 있다면
            System.out.println((i++) +"번째 토큰: " + st.nextToken());
        }
    }
}
