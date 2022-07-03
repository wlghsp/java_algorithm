package inflearn.soring_searching.q47_중복확인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_정렬풀이 {

    public static char solution(int n, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) if (arr[i] == arr[i+1]) return 'D';
        return 'U';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(N, arr));
    }
}
