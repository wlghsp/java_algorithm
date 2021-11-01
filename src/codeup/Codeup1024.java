package codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        for (String string : str) {
            System.out.printf("\'%s\'%n", string);
        }
    }
}
