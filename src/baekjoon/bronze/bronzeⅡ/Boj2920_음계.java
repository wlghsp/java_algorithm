package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2920_음계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        int[] asc = {1,2,3,4,5,6,7,8};
        int[] desc = {8,7,6,5,4,3,2,1};
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean isAsc = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != asc[i]) {
                isAsc = false;
                break;
            }
        }
        boolean isDesc = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != desc[i]) {
                isDesc = false;
                break;
            }
        }
        if (isAsc) {
            System.out.println("ascending");
        } else if(isDesc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
