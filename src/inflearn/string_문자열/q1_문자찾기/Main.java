package inflearn.string_문자열.q1_문자찾기;


import java.util.Scanner;

public class Main {
    public int solution(String str, char c) {
        int answer = 0;
        // Idea *** 전부 대문자 or 소문자로 변환 ****
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb =new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        Main T = new Main();
        System.out.println(T.solution(str, c));
        return ;
    }
}
