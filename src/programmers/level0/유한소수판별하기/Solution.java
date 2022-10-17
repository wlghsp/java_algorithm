package programmers.level0.유한소수판별하기;

public class Solution {

    public int solution(int a, int b) {
        int answer = 2;
        int i = 2;
        while (true) {
            if (a % i == 0 && b % i == 0) {
                while (a % i == 0 && b % i == 0) {
                    a /= i;
                    b /= i;
                }
            }
            if (i > a || i > b) break;
            i++;
        }

        for (int j = 2; j <= 5; j+= 3) {
            while (b % j == 0) {
                b /= j;
            }
        }
        if (b == 1) answer = 1;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7, 20));  // 1
        System.out.println(s.solution(11, 22));  // 1
        System.out.println(s.solution(12, 21));  // 2
    }
}
