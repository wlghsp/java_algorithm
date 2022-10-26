package baekjoon.bronze.bronzeⅠ.boj16466_콘서트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int j = 0;
        int answer = 0;
        boolean found = false;
        int i = 1;
        while (j < N) {
            if (arr[j++] != i){
                answer = i;
                found = true;
                break;
            }
            i++;
        }
        if (found) System.out.println(answer);
        else {
            System.out.println(i);
        }
    }
}
