package programmers.level2.연속부분수열합의개수;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] elements) {
        Set<Integer> sums = new HashSet<>();
        int n = elements.length;

        // 원형 수열을 처리하기 위해 두 번 반복되는 배열을 만든다.
        int[] circularElements = new int[2 * n];
        for (int i = 0; i < n; i++) {
            circularElements[i] = elements[i];
            circularElements[i + n] = elements[i];
        }

        // 모든 길이에 대해 연속 부분 수열의 합을 구한다.
        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 0; i < length; i++) {
                    sum += circularElements[start + i];
                }
                sums.add(sum);
            }
        }


        return sums.size();
    }
}
