package baekjoon.silverⅣ.Boj1120_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        String a = s[0];
        String b = s[1];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < b.length() - a.length() + 1; i++) {
            int cnt = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(i+j)) {
                    cnt++;
                }
            }
            result.add(cnt);
        }

        int min = Integer.MAX_VALUE;

        for (Integer integer : result) {
            if (min > integer) {
                min = integer;
            }
        }
        System.out.println(min);

    }
}
