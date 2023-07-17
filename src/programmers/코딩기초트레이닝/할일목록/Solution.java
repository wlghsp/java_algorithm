package programmers.코딩기초트레이닝.할일목록;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public String[] solution(String[] todo_list, boolean[] finished) {
        long countFalse = IntStream.range(0, finished.length)
                .filter(i -> !finished[i])
                .count();
        String[] answer = new String[(int) countFalse];
        int idx = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[idx++] = todo_list[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"},
                new boolean[]{true, false, true, false}))); // ["practiceguitar", "studygraph"]
    }
}
