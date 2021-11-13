package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*


3 1
3 2 6

16

4 2
4 2 3 1

19

*/

public class Boj15903_카드합체놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 카드의 갯수
        int m = Integer.parseInt(st.nextToken()); // 카드 합체 횟수
        int sum = 0; // 최종 합계
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        for (int i = 0; i < m; i++)
            arr[0] = arr[1] = arr[0] + arr[1];
        for (int i : arr)
            sum += i;
        System.out.println(sum);
    }

}
