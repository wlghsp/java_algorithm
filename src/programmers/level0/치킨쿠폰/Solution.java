package programmers.level0.치킨쿠폰;

public class Solution {

    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        while (coupon >= 10) {
            answer += coupon / 10;
            coupon = coupon / 10 + coupon % 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(100)); // 11
        System.out.println(s.solution(1081)); // 120

    }
}
