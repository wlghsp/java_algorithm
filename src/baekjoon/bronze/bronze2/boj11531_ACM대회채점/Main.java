package baekjoon.bronze.bronze2.boj11531_ACM대회채점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int solvedCount = 0;
        int elapsedTime = 0;

        String log;
        Map<String, Integer> wrongCntMap = new HashMap<>();

        while (!(log = br.readLine()).equals("-1")) {
            String[] arr = log.split(" ");
            int m = Integer.parseInt(arr[0]);
            String problemName = arr[1];
            String result = arr[2];

            // 계산
            if (result.equals("right")) {
                solvedCount++;
                elapsedTime += m;
                if (wrongCntMap.containsKey(problemName)) {
                    elapsedTime += wrongCntMap.get(problemName) * 20;
                }
            } else {
                wrongCntMap.put(problemName, wrongCntMap.getOrDefault(problemName, 0) + 1);
            }
        }

        // 푼 문제 수 총 걸린 시간(페널티 포함) 출력
        System.out.println(solvedCount + " " + elapsedTime);
    }
}
