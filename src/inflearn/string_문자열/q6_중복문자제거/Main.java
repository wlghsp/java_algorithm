package inflearn.string_문자열.q6_중복문자제거;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<>();
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(c[i])) {
                list.add(c[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Main T = new Main();
        System.out.println(T.solution(s));
    }
}
