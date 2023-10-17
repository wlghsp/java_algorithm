package baekjoon.bronze.bronzeⅡ.boj20528_끝말잇기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        }

        System.out.println(isPossible(arr) ? 1 : 0);

    }

    private static boolean isPossible(String[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].charAt(arr[i].length() - 1) !=
                    arr[i-1].charAt(arr[i-1].length() - 1)
            ) {
                return false;
            }
        }

        return true;
    }
}
