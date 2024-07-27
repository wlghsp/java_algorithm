package programmers.level2.기능개발;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] daysToComplete = new int[n];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int remainingProgress = 100 - progresses[i];
            int days = (int) Math.ceil((double) remainingProgress / speeds[i]);
            daysToComplete[i] = days;
        }

        // 배포 날짜를 기준으로 기능 그룹화
        int currentMaxDays = daysToComplete[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (daysToComplete[i] <= currentMaxDays) {
                count++;
            } else {
                result.add(count);
                currentMaxDays = daysToComplete[i];
                count = 1;
            }
        }

        result.add(count);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
