package baekjoon.bronze.bronzeⅠ.Boj2947_나무조각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j+1);

                    for (int num : arr) {
                        sb.append(num).append(" ");
                    }
                    sb.append('\n');
                }
            }
        }

        System.out.println(sb);


    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
