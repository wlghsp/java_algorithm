package inflearn.q11_문자열압축;
import java.util.Scanner;

public class Main2 {

    public void solution(String s) {
        String answer = "";

        // 이 부분이 중요, 뒤에 " " 공백을 넣어줌
        s = s + " ";

        int cnt = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
              cnt++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        T.solution(str);
    }
}
