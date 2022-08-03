package baekjoon.bronze.bronzeⅡ.Boj10822_더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(",");

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result += Integer.parseInt(nums[i]);
        }

        System.out.println(result);

    }
}
