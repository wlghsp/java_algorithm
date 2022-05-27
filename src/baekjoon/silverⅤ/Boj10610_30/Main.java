package baekjoon.silverⅤ.Boj10610_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        // 해당 숫자 재배치 시작
        char[] charArr = str.toCharArray();
        // 오름차순 정렬, 내림차순 정렬은 참조타입을 사용해야해서 귀찮음
        // 오름차순 정렬하고 배열의 뒤에서부터 StringBuilder로 붙여 나간다.
        // 이와 합계도 동시에 구함.
        Arrays.sort(charArr);
        int len = charArr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = len -1; i >= 0 ; i--) {
            int num = charArr[i] - 48;
            sum += num;
            sb.append(num);
        }
        // 30의 배수인지 판단하기 위한 조건 생성
        /*
            30의 배수 조건
            1. 뒷자리가 0일 것 (0이 몇개여도 상관없음)
            2. 각 자리수의 합이 3의 배수
        */
        // 만약 맨 뒷자리 숫자가 0이 아니거나 3의 배수가 아니라면
        if (charArr[0] != '0'|| sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sb);

    }
}
