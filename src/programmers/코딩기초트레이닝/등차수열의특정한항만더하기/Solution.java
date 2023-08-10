package programmers.코딩기초트레이닝.등차수열의특정한항만더하기;

public class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (i * d);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 4, new boolean[]{true, false, false, true, true})); // 37
    }
}
