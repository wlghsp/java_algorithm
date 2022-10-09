package programmers.level0.점의위치구하기;

public class Solution {

    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) answer = 1;
        else if (dot[0] < 0 && dot[1] > 0) answer = 2;
        else if (dot[0] < 0 && dot[1] < 0) answer = 3;
        else answer = 4;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{2, 4}));  // 1
        System.out.println(s.solution(new int[]{-7, 9})); // 2

    }

}
