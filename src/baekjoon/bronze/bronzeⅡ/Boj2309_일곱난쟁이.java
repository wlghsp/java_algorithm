package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2309_일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 9;
        int[] dwarves = new int[n];
        int sum = 0;
        for (int i = 0; i < dwarves.length; i++) {
            dwarves[i] = Integer.parseInt(br.readLine());
            sum += dwarves[i];
        }

        /*
        [idea]
        먼저 숫자를 배열에 집어넣고, 9개의 합을 구한다.
        9개의 합에서 2개를 뺀 결과가 100인 경우를 찾고
        그 2개를 제외한 7개를 오름차순 정렬한다.
        */

        Arrays.sort(dwarves);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(sum - dwarves[i] - dwarves[j] == 100) {
                    for (int k = 0; k < n; k++) {
                        if (k == i || k== j) {
                            continue;
                        }
                        System.out.println(dwarves[k]);
                    }
                    // 반복문을 종료하지 않으면 다른 정답을 출력할 수 있다.
                    System.exit(0);
                }
            }
        }

    }
}
