package programmers.level0.배열원소의길이;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int j = 0;
        for (String s : strlist) {
            answer[j++] = s.length();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"We", "are", "the", "world!"}))); // [2, 3, 3, 6]
        System.out.println(Arrays.toString(s.solution(new String[]{"I", "Love", "Programmers."}))); // [1, 4, 12]
    }
}
