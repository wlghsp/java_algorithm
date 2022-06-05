package baekjoon.silverⅤ.Boj10867_중복빼고정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);

    }

}

