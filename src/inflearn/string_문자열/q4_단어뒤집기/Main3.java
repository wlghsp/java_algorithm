package inflearn.string_문자열.q4_단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // 특정문자만 뒤집을 때,
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt<rt) { // 짝수길이일 경우 lt가 rt보다 커지므로 이때 종료함. 홀수길이는 같아짐
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main3 T = new Main3();
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
