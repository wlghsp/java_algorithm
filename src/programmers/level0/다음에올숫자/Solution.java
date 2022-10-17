package programmers.level0.다음에올숫자;

public class Solution {

    public int solution(int[] common) {
        int answer = 0;
        if ((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common[common.length-1] + ((common[1] - common[0]));
        } else {
            answer = common[common.length-1] * ((common[1] / common[0]));
        }
        return answer;
    }



    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4})); // 5
        System.out.println(s.solution(new int[]{2, 4, 8})); // 16
    }
}
