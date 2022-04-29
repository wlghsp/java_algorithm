package cs_senpai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj11866_요세푸스문제0_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int index = 0;
        while (list.size() > 1) {
            index = (index + (k-1)) % list.size();
            sb.append(list.remove(index)).append(", "); // index 위치에 있는 요소를 출력
        }

        // 마지막으로 남은 요소 삭제함과 동시에 출력
        sb.append(list.remove()).append(">");


        System.out.println(sb);
        //<3, 6, 2, 7, 5, 1, 4>

    }
}
