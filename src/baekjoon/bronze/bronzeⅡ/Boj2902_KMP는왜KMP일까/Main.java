package baekjoon.bronze.bronzeⅡ.Boj2902_KMP는왜KMP일까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("-");
        String result = "";
        for (int i = 0; i < input.length; i++) {
            result += input[i].charAt(0);
        }

        System.out.println(result);
    }
}
