package baekjoon.bronze.bronzeⅠ.Boj9506_약수들의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < n / 2 + 1; i++) {
                if (n % i == 0) list.add(i);
            }

            if (n == list.stream().mapToInt(i -> i).sum()) {
                sb.append(n).append(" = ");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i));
                    if (i < list.size() - 1) sb.append(" + ");
                    else sb.append("\n");
                }
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }
        System.out.println(sb);
    }
}
