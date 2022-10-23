package programmers.커뮤러닝7기.first_week.숫자게임;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int i_b = B.length - 1;
        for (int i = A.length -1 ; i >=0; i--) {
            if (B[i_b] > A[i]){
                answer++;
                i_b--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{5,1,3,7}, new int[]{2,2,6,8}));  // 3
        System.out.println(s.solution(new int[]{2,2,2,2}, new int[]{1,1,1,1}));  // 0
    }
}
