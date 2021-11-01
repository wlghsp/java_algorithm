package java_study;

import java.io.IOException;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) throws IOException {
        // char를 입력 받을 때는 (char)System.in.read 메서드를 이용한다. 
        // char ch;
        // ch = (char) System.in.read();
        // System.out.println(ch);

        // char를 여러개 입력 받을 때는 nextLine메서드를 이용한다. 
        char a, b;
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        a = str.charAt(0);
        b = str.charAt(2);
        System.out.println(a + " " + b);
        sc.close();

    }
}
