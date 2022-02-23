package baekjoon.bronze.bronzeⅢ;

import java.util.Scanner;

public class Boj11718_그대로출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println(input);
        }
        sc.close();
    }
}
