package baekjoon.bronze.bronzeⅠ.Boj1145_적어도대부분의배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[5];
        int minVal = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            if (minVal > nums[i]) {
                minVal = nums[i];
            }
        }

        while (true) {
            int cnt = 0;
            for (int i = 0; i < 5; i++) {
                if (minVal % nums[i] == 0){
                    cnt++;
                }
            }
            if (cnt > 2) {
                System.out.println(minVal);
                break;
            }
            minVal++;
        }


    }
}
