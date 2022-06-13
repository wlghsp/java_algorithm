package baekjoon.bronze.bronzeⅠ.Boj6996_애너그램;

import java.util.Scanner;

public class Main_배열풀이 {

    private static boolean solveAnagrams(String first, String second) {
        /* ------------------- INSERT CODE HERE --------------------
         *
         * Your code should return true if the two strings are anagrams of each other.
         *
         * */
        int[] alphabet = new int[26];
        for (int i = 0; i < first.length(); i++) {
            alphabet[first.charAt(i) - 'a']++;
        }
        for (int i = 0; i < second.length(); i++) {
            alphabet[second.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] != 0) {
                return true;
            }
        }

        return false;

        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "NOT anagrams." : "anagrams."));
        }
    }
}
