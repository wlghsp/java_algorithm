package thisIsCodingTest.알고리즘유형별기출문제.구현.Boj18406_럭키스트레이트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        int firstSum = 0;
        int secondSum = 0;

        int half = num.length() / 2;
        for (int i = 0; i < half; i++) {
            firstSum += num.charAt(i) - '0';
        }

        for (int i = half; i < num.length(); i++) {
            secondSum += num.charAt(i) - '0';
        }

        if (firstSum == secondSum) System.out.println("LUCKY");
        else System.out.println("READY");

    }
}
