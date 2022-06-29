package baekjoon.bronze.bronzeⅡ.Boj2577_숫자의개수;

import java.io.IOException;
import java.util.Scanner;


public class Boj2577_숫자의개수_다른풀이2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] input = Integer.toString(sc.nextInt() * sc.nextInt() * sc.nextInt()).split("");

        int[] cnt = new int[10];

        for (String s: input) cnt[Integer.parseInt(s)]++;

        for(int i=0; i<10; i++) System.out.println(cnt[1]);


    }
}
