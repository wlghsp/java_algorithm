package baekjoon.bronze.bronze1.boj28702_FizzBuzz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/bronze/bronze1/boj28702_FizzBuzz/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int lastNum = 0;
        for (int i = 3; i > 0; i--) {
            String s = br.readLine();
            if (isNumeric(s)) {
                lastNum = Integer.parseInt(s);
                index = i;
            }
        }

        int nextNum = lastNum + index;

        printFizzBuzz(nextNum);

    }

    private static void printFizzBuzz(int nextNum) {
        if (nextNum % 3 == 0 && nextNum % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (nextNum % 3 == 0) {
            System.out.println("Fizz");
        } else if (nextNum % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nextNum);
        }
    }

    public static boolean isNumeric(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}
