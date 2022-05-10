package baekjoon.silverⅤ.Boj10814_나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[][] members = new String[N][2];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            members[i][0] = age;
            members[i][1] = name;
        }
        // 나이순으로 정렬하면서 이름은 따로 비교를 안한다면 나이순으로 정렬하되, 나이가 같을 경우는 0이 반환되어 자연스레 입력순으로 정렬된다.

        Arrays.sort(members, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

//        Arrays.sort(members, (o1, o2) -> {
//            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(members[i][0]).append(' ').append(members[i][1]).append('\n');
        }

        System.out.println(sb);

    }
}
