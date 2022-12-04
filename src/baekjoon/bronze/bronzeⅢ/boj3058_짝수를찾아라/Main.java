package baekjoon.bronze.bronzeⅢ.boj3058_짝수를찾아라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int minVal = Integer.MAX_VALUE;
            int sumOfEvenNum = 0;
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 0) {
                    sumOfEvenNum += num;
                    if (num < minVal) {
                        minVal = num;
                    }
                }
            }
            System.out.println(sumOfEvenNum + " " + minVal);
        }

    }
}
