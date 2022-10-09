package programmers.level0.양꼬치;

public class Solution {
    public int solution(int n, int k) {
        return n * 12000 + k * 2000 - (n/10) * 2000;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(10, 3)); // 124000
        System.out.println(s.solution(64, 6)); // 768000

    }

}
