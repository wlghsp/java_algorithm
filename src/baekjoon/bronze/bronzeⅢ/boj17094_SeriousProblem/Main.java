package baekjoon.bronze.bronzeⅢ.boj17094_SeriousProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int numTwoCnt = getCharCnt(s, '2');
        int alphaECnt = getCharCnt(s, 'e');
        if (numTwoCnt > alphaECnt) {
            System.out.println(2);
        } else if (numTwoCnt < alphaECnt) {
            System.out.println("e");
        } else {
            System.out.println("yee");
        }

    }

    private static int getCharCnt(String s, char e) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == e) {
                result++;
            }
        }
        return result;
    }
}
