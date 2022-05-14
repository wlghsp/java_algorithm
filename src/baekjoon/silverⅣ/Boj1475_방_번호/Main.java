package baekjoon.silverⅣ.Boj1475_방_번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        int[] arr = new int[10];
        for (char c : number.toCharArray()) {
            int num = c - '0';
            if (num == 9 || num == 6) {
                if (arr[6] <= arr[9]){
                    arr[6]++;
                } else {
                    arr[9]++;
                }
            } else {
                arr[num]++;
            }
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}
