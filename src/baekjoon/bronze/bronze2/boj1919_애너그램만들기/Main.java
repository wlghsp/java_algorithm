package baekjoon.bronze.bronze2.boj1919_애너그램만들기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int answer;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/bronze/bronze2/boj1919_애너그램만들기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int[] aArr = getAlphabetCountArr(a);
        int[] bArr = getAlphabetCountArr(b);

        answer = 0;
        for (int i = 0; i < 26; i++) {
            answer += Math.abs(aArr[i] - bArr[i]);
        }


        System.out.println(answer);
    }

    private static int[] getAlphabetCountArr(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }
}
