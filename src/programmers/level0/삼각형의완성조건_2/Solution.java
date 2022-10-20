package programmers.level0.삼각형의완성조건_2;

public class Solution {

    public int solution(int[] sides) {
        int answer = 0;
        int sum = sides[0] + sides[1];
        int bigger = Math.max(sides[0], sides[1]);
        int smaller = Math.min(sides[0], sides[1]);
        // 1. 가장 긴변이 두 수 중에 하나인 경우
        for (int i = 0; i < bigger; i++) {
            if (bigger < smaller + i){
                answer++;
            }
        }
        // 2. 나머지 한 변이 가장 긴 변인 경우
        for (int i = bigger; i < sum; i++) {
            if (i < sum) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(new int[]{1,2})); // 1
        System.out.println(s.solution(new int[]{3,6})); // 5
        System.out.println(s.solution(new int[]{11,7})); // 13
    }
}
