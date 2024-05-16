package baekjoon.silver.silver4.boj1620_나는야포켓몬마스터이다솜;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<Integer, String> numMap = new HashMap<>();
        Map<String, Integer> strMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            numMap.put(i, name);
            strMap.put(name, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (Character.isDigit(s.charAt(0))) {
                sb.append(numMap.get(Integer.parseInt(s)));
            } else {
                sb.append(strMap.get(s));
            }
            sb.append(System.lineSeparator());
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);

    }
}
