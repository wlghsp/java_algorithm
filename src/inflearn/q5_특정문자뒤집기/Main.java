package inflearn.q5_특정문자뒤집기;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer= "";
        // 특정문자만 뒤집을 때,
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while (lt<rt) {
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])){
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        /*for (int i = 0; i < s.length; i++) {
            answer += s[i];
        }*/

        // String.valueOf로 char[]배열을 String 으로 변환할 수 있음
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
