package programmers.코딩기초트레이닝._5명씩;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] names) {
        int size = names.length % 5 != 0 ? names.length / 5 + 1 : names.length / 5;
        String[] answer = new String[size];
        for (int i = 0; i < size; i++) {
            answer[i] = names[i * 5];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern"})));

    }
}
