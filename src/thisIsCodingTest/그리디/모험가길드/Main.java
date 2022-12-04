package thisIsCodingTest.그리디.모험가길드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
5
2 3 1 2 2
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] fears = new int[N];
        for (int i = 0; i < N; i++) {
            fears[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(fears);

        int result = 0; // 총 그룹의 수
        int count = 0;  // 현재 그룹에 포함된 모험가의 수

        for (int f : fears) {
            count++; // 현재 그룹에 해당 모험가를 포함시키기
            if (count >= f) { // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
                result += 1;  // 총 그룹의 수 증가시키기
                count = 0; // 현재 그룹에 포함된 모험가의 수 초기화
            }
        }
        System.out.println(result);
    }
}
