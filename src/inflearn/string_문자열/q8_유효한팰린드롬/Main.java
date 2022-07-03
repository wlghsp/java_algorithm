package inflearn.string_문자열.q8_유효한팰린드롬;


import java.util.Scanner;

public class Main {
    public void solution(String str) {

       str = str.toUpperCase().replaceAll("[^A-Z]", "");
       String tmp = new StringBuilder(str).reverse().toString();
       System.out.println(str.equals(tmp) == true ? "YES": "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Main T = new Main();
        T.solution(s);
    }
}
