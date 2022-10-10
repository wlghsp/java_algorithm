package programmers.level0.피자나눠먹기_2;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        while (true) {
            answer++;
            int slices = 6 * answer;
            if (slices % n == 0) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(6));  // 1
        System.out.println(s.solution(10)); // 5
        System.out.println(s.solution(4));  // 2
    }
}
