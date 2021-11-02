package codeup;

import java.io.IOException;
import java.util.Scanner;

public class Codeup1029 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        String str = String.format("%.11f", num);
        System.out.println(str);
    }

}
