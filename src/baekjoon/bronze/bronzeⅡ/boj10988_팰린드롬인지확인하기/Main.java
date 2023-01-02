package baekjoon.bronze.bronzeⅡ.boj10988_팰린드롬인지확인하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int isPalindrome(String word) {
        return recursion(word, 0, word.length() - 1);
    }

    private static int recursion(String word, int l, int r) {
        if (l >= r) return 1;
        if (word.charAt(l) != word.charAt(r)) return 0;
        return recursion(word, l + 1, r - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(isPalindrome(word));
    }
}
