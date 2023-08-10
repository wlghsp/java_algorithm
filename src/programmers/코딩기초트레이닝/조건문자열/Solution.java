package programmers.코딩기초트레이닝.조건문자열;

public class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String full = ineq + eq;
        switch (full) {
            case ">=":
                answer = n >= m ? 1 : 0;
                break;
            case "<=":
                answer = n <= m ? 1 : 0;
                break;
            case ">!":
                answer = n > m ? 1 : 0;
                break;
            default:
                answer = n < m ? 1 : 0;
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("<", "=", 20, 50)); // 1
        System.out.println(s.solution(">", "!", 41, 78)); // 0
    }
}
