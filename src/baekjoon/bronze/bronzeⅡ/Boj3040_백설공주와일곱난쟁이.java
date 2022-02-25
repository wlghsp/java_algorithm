package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj3040_백설공주와일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        [idea]
        먼저 숫자를 배열에 집어넣고, 9개의 합을 구한다.
        9개의 합에서 2개를 뺀 결과가 100인 경우를 찾고
        그 2개를 제외한 7개를 오름차순 정렬한다.
        */
        int n = 9;
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        sb.append(arr[k]+"\n");
                    }
                }
                // 항상 답이 유일한 경우만 입력으로 주어지므로 답이 나오고 종료할 필요는 없지만
                // 다른 답이 나올 수 있는 경우 System.exit(0);으로 바로 종료시킨다. 출력도 한번에 출력이 아닌 매번 출력하는 식으로 한다.
                // 그래도 7번 한다.
            }
        }
        System.out.println(sb);
    }
}
