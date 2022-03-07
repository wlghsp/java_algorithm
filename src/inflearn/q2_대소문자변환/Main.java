package inflearn.q2_대소문자변환;

import java.util.Scanner;

public class Main {

    private String solution(String str) {
        String answer = "";
        char tmp;
        for (int i = 0; i < str.length(); i++) {
            tmp = str.charAt(i);

            if ((65<= tmp) && (tmp <= 90)){ // 대문자
                answer += String.valueOf(tmp).toLowerCase(); // 소문자 변환
            } else if((97<= tmp) && (tmp <= 122)) { // 소문자
                answer += String.valueOf(tmp).toUpperCase(); // 대문자 변환
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
