package inflearn.q9_숫자만추출;

import java.util.Scanner;

public class Main2 {

    public void solution(String s) {
        int answer = 0;
        for(char x : s.toCharArray()) {
            if (x >= 48 && x  <= 57) answer = answer * 10 + (x - 48);
        }
        System.out.println(answer);

    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        T.solution(s);
    }
}
