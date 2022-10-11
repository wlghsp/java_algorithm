package programmers.level0.팩토리얼;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        for (int i = 1; i <= 10; i++) {
            fac *= i;
            if (fac <= n) {
                answer = i;
            } else break;
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3628800)); // 10
        System.out.println(s.solution(7)); // 3
    }
}
