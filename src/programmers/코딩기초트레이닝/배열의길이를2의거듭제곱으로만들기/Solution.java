package programmers.코딩기초트레이닝.배열의길이를2의거듭제곱으로만들기;

import java.util.Arrays;

public class Solution {

    public boolean powerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public int[] solution(int[] arr) {
        int cnt = 0;
        for (int i = arr.length; i <= 1024; i++) {
            if(powerOfTwo(i)) {
                cnt = i - arr.length;
                break;
            }
        }
        int[] answer = new int[arr.length + cnt];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,3,4,5,6}))); // [1, 2, 3, 4, 5, 6, 0, 0]
        System.out.println(Arrays.toString(s.solution(new int[]{58, 172, 746, 89}))); // [58, 172, 746, 89]
    }
}
