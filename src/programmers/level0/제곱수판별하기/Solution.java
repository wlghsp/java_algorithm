package programmers.level0.제곱수판별하기;

public class Solution {

//    public int solution(int n) {
//        int tmp = (int) Math.sqrt(n);
//        return tmp * tmp == n ? 1 : 2;
//    }
    public int solution(int n) {
        // n의 제곱근으로 나눈 나머지가 0이라면 제곱수
        return n % Math.sqrt(n) == 0 ? 1 : 2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(144));  // 1
        System.out.println(s.solution(976));  // 2
    }
}
