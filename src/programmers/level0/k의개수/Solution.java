package programmers.level0.k의개수;

public class Solution {

    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j; l++) {
            String numStr = l + "";
            for (int m = 0; m < numStr.length(); m++) {
                if ((numStr.charAt(m) - 48) == k) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1, 13, 1));  // 6
        System.out.println(s.solution(10, 50, 5)); // 5
        System.out.println(s.solution(3, 10, 2));  // 0
    }
}
