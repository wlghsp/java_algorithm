package inflearn;


import java.util.Scanner;

public class Q1_문자찾기 {

    public int solution(String str, char c) {
        int answer = 0;
        // 전부 대문자 or 소문자로 변환

        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) answer++;
        }*/
        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb =new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        Q1_문자찾기 T = new Q1_문자찾기();
        System.out.println(T.solution(str, c));
        return ;
    }
}
