package baekjoon.silver.silver5.boj4659_비밀번호발음하기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj4659_비밀번호발음하기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if ("end".equals(str)) {
                break;
            }
            boolean acceptable = true;

            if (noVowelMatch(str)) acceptable = false;

            if (threeConsecutiveVowelOrConsonant(str)) acceptable = false;

            if (twoConsecutiveLetter(str)) acceptable = false;

            System.out.println("<" + str + "> is " + (acceptable ? "" : "not ") + "acceptable.");

        }
    }

    private static boolean twoConsecutiveLetter(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (isNotOkay(str, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNotOkay(String str, int i) {
        String substr = str.substring(i, i + 2);
        if (substr.equals("ee") || substr.equals("oo")) return false;
        return (str.charAt(i) == str.charAt(i + 1));
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private static boolean threeConsecutiveVowelOrConsonant(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
                consonantCount = 0;
            } else if (Character.isLetter(c)) {
                consonantCount++;
                vowelCount = 0;
            }

            if (vowelCount >= 3 || consonantCount >= 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean noVowelMatch(String str) {
        return !str.matches(".*[aeiou].*");
    }
}
