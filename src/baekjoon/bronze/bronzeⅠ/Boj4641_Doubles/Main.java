package baekjoon.bronze.bronzeⅠ.Boj4641_Doubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            String original = br.readLine();
            if (original.equals("-1")) break;
            st = new StringTokenizer(original);
            int cnt = 0;
            List<Integer> list = new ArrayList<>();
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
            }
            for (int i = 0; i < list.size(); i++) {
                int byTwo = list.get(i) * 2;
                if (byTwo != 0 && list.contains(byTwo)) cnt++;
            }

            sb.append(cnt).append('\n');
        }
        System.out.println(sb);

    }
}
