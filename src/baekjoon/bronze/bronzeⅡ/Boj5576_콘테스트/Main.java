package baekjoon.bronze.bronzeⅡ.Boj5576_콘테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> w = new ArrayList<>();
        List<Integer> k = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            w.add(Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < 10; i++) {
            k.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(w, Collections.reverseOrder());
        Collections.sort(k, Collections.reverseOrder());

        int wResult = 0;
        int kResult = 0;
        for (int i = 0; i < 3; i++) {
            wResult += w.get(i);
            kResult += k.get(i);
        }
        System.out.println(wResult + " " + kResult);

    }
}
