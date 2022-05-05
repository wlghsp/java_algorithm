package leetcode.finished;

import java.util.Arrays;

public class LeetCode1710_MaximumUnitsOnATruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]); // 두 번째 숫자 기준 내림차순
        int cnt = 0;
        int answer = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int box = boxTypes[i][0];
            int unit = boxTypes[i][1];
            cnt += box;
            if (cnt > truckSize){
                answer += (truckSize - (cnt - box)) * unit;
                break;
            }
            answer += box * unit;
        }

        return answer;
    }
}
