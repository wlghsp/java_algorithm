package inflearn.string_문자열.q7_회문문자열;


import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public String solution(String str) {
        str = str.toLowerCase(Locale.ROOT);
        // 인덱스 절반 전까지만 i가 올라가면 전부 비교 됨.
        for (int i = 0; i < str.length()/2; i++) {
            // 일치하지 않는 문자가 있다면 회문이 아님
            if (str.charAt(i) != str.charAt(str.length()-1-i)) return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Main2 T = new Main2();
        System.out.println(T.solution(s));

    }
}
