package baekjoon.bronze.bronze3.boj1284_집_주소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int[] NUM_LENGTHS = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while (true) {
            str = br.readLine();
            if (str.equals("0")) {
                break;
            }

            int numberLength = 2 + str.length() - 1;

            numberLength += str.chars()
                    .map(ch -> NUM_LENGTHS[ch - '0'])
                    .sum();

            System.out.println(numberLength);
        }

    }
}
