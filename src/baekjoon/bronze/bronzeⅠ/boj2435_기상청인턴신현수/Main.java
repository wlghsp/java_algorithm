package baekjoon.bronze.bronzeⅠ.boj2435_기상청인턴신현수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int N;
    public static Integer getMaxVal(int days) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N - days + 1; i++) {
            int sum = 0;
            for (int j = i; j < days + i; j++) {
                sum += arr[j];
            }
            list.add(sum);
        }
        return list.stream()
                .mapToInt(x -> x)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(getMaxVal(K));

    }

}
