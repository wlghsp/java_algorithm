package baekjoon.bronze.bronzeⅡ.boj5218_알파벳거리;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        /* ------------------- INSERT CODE HERE ---------------------*/
        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i);
            char y = s2.charAt(i);
            answer.add(getDistance(x, y));
        }
        /* -------------------- END OF INSERTION --------------------*/
        return answer;
    }

    private static int getDistance(char x, char y) {
        if (y >= x) return y - x;
        else return (y + 26) - x;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {
            String s1 = sc.next();
            String s2 = sc.next();

            ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
            System.out.print("Distances: ");

            for(Integer d : answer) {
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}
