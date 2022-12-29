package baekjoon.bronze.bronzeⅢ.boj11970_FencePainting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        int ans = 0;
        int[] fence = new int[101];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        for (int i = arr[0]; i < arr[1]; i++) fence[i] = 1;
        st = new StringTokenizer(br.readLine());
        arr[2] = Integer.parseInt(st.nextToken());
        arr[3] = Integer.parseInt(st.nextToken());
        for (int i = arr[2]; i < arr[3]; i++) fence[i] = 1;
        for (int i = 0; i < fence.length; i++) {
            if (fence[i] == 1) ans++;
        }
        System.out.println(ans);
    }
}
