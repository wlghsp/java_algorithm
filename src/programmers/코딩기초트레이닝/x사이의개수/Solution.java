package programmers.코딩기초트레이닝.x사이의개수;

import java.util.Arrays;

public class Solution {
    public int[] solution(String myString) {
        int[] arr = new int[100001];
        int idx = 0;
        int cnt = 0;
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'x') {
                arr[idx++] = cnt;
                cnt = 0;
            } else {
                cnt++;
            }
            if (i == myString.length() - 1) arr[idx++] = cnt;
        }
        return Arrays.copyOfRange(arr, 0, idx);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("oxooxoxxox")));  // [1, 2, 1, 0, 1, 0]
        System.out.println(Arrays.toString(s.solution("xabcxdefxghi")));  // [0, 3, 3, 3]

    }
}
