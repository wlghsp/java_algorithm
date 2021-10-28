package java_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ToCharArrayEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        System.out.println(Arrays.deepToString(arr));
        
    }
}
