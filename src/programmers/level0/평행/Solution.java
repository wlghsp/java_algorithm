package programmers.level0.평행;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[][] dots) {
        // 기울기를 저장할 집합
        Set<Double> slopes = new HashSet<>();

        // 모든 두 점 쌍에 대한 기울기 계산
        int cnt = 0;
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                int[] point1 = dots[i];
                int[] point2 = dots[j];
                double slope;

                // 두 점이 같은 경우, 기울기를 무한대로 설정
                slope = (double) (point2[1] - point1[1]) / (point2[0] - point1[0]);

                // 기울기를 집합에 추가
                slopes.add(slope);
                cnt++;
            }
        }

        return cnt == slopes.size() ? 0 : 1;
    }



}
