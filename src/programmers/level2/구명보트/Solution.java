package programmers.level2.구명보트;

import java.util.Arrays;

public class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int left = 0;
        for (int right = people.length - 1; right >= left; right--) {
            if (people[right] + people[left] <= limit) {
                left++;
            }
            answer++;
        }

        return answer;
    }
}
