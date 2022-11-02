package baekjoon.silverⅣ.boj1920_수_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] a;
    static int[] b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());
        b = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) b[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(a);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            if (binarySearch(b[i])) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }
        System.out.println(sb);
    }

    private static boolean binarySearch(int num) {
        int mid;
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == num) return true;
            else if (a[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
