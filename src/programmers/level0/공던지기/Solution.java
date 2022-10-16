package programmers.level0.공던지기;

public class Solution {
    public int solution(int[] numbers, int k) {
        return numbers[(k - 1) * 2 % numbers.length];
    }

    // 내 풀이
    public int solution1(int[] numbers, int k) {
        int answer = 0;
        int i = 1;
        while (true) {
            answer++;
            if (answer == k) break;
            i += 2;
        }
        return i % numbers.length;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1,2,3,4}, 2)); // 3
        System.out.println(s.solution(new int[]{1,2,3,4,5,6}, 5)); // 3
        System.out.println(s.solution(new int[]{1,2,3}, 3)); // 2
    }
}
