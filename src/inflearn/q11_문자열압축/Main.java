package inflearn.q11_문자열압축;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public void solution(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                sb.append(s.charAt(i - 1));
                if (count != 1) sb.append(count);
                count = 1;
                if (i== s.length()-1) {
                    sb.append(s.charAt(i));
                    if (count != 1) sb.append(count);
                }
            } else {
                count++;
                if (i== s.length()-1) {
                    sb.append(s.charAt(i));
                    if (count != 1) sb.append(count);
                }
            }
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        T.solution(str);
    }
}
