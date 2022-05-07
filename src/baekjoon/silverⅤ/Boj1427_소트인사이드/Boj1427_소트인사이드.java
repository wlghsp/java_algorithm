package baekjoon.silverⅤ.Boj1427_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj1427_소트인사이드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        List<Integer> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            list.add(c -'0');
        }

        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (Integer i : list) {
            sb.append(i);
        }

        System.out.println(sb);
    }
}
