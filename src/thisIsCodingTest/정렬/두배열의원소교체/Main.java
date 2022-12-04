package thisIsCodingTest.정렬.두배열의원소교체;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


/*
5 3
1 2 5 4 3
5 5 6 6 5
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] a = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int[] b = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        Integer[] descB = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(descB, Comparator.reverseOrder());
        for (int i = 0; i < K; i++) {
            // 배열 a의 원소가 b의 원소보다 작은 경우
            if (a[i] < descB[i]){
                int tmp = a[i];
                a[i] = descB[i];
                descB[i] = tmp;
            } else break; // 배열 a의 원소가 b의 원소보다 크거나 같을 때, 반복문을 탈출
        }

        System.out.println(Arrays.stream(a).sum());

    }
}
