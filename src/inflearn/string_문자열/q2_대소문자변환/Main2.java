package inflearn.string_문자열.q2_대소문자변환;

import java.util.Scanner;

public class Main2 {

    private String solution(String str) {
        String answer = "";
        char tmp;

        for(char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
           /* if(x >= 65 && x <= 90) answer += (char)(x +32); // 대문자
            else answer += (char)(x - 32);*/

        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
