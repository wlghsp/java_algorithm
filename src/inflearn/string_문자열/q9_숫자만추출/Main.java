package inflearn.string_문자열.q9_숫자만추출;

import java.util.Scanner;

public class Main {

    public void solution(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) answer+=x;
        }
        System.out.println(Integer.parseInt(answer));
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        T.solution(s);
    }
}
