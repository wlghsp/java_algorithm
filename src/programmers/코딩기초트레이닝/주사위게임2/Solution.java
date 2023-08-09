package programmers.코딩기초트레이닝.주사위게임2;

public class Solution {

    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else if ((a == b) && (b == c)) {
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c)) * ((a * a * a) + (b * b * b) + (c * c * c));
        } else {
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c));
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 6, 1));  // 9
        System.out.println(s.solution(5, 3, 3));  // 473
        System.out.println(s.solution(4, 4, 4));  // 110592

    }
}
