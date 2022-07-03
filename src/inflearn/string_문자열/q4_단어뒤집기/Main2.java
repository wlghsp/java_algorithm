package inflearn.string_문자열.q4_단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main2 T = new Main2();
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String s : T.solution(n, str)) {
            System.out.println(s);
        }

    }
}
