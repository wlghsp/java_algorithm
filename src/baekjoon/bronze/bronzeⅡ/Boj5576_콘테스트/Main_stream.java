package baekjoon.bronze.bronzeⅡ.Boj5576_콘테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main_stream {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] w = new int[10];
        int[] k = new int[10];

        for (int i = 0; i < 10; i++) w[i] = Integer.parseInt(br.readLine());
        for (int i = 0; i < 10; i++) k[i] = Integer.parseInt(br.readLine());

        int wResult = IntStream.of(w)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .limit(3)
                .sum();
        int kResult = IntStream.of(k)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .limit(3)
                .sum();

        System.out.println(wResult + " " + kResult);

    }
}
