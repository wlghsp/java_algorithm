package inflearn.q7_회문문자열;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public void solution(String str) {

        //str = str.toLowerCase(Locale.ROOT);
        String str1 = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(str1)) {
            System.out.println("YES");
        } else System.out.println("NO");


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Main T = new Main();
        T.solution(s);
    }
}
