package codeup.basic100;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        System.out.printf("[%s0000]\n", str[0]);
        System.out.printf("[%s000]\n", str[1]);
        System.out.printf("[%s00]\n", str[2]);
        System.out.printf("[%s0]\n", str[3]);
        System.out.printf("[%s]", str[4]);
    }
}
