package programmers.level0.주사위의개수;

public class Solution {
    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1,1,1}, 1)); // 1
        System.out.println(s.solution(new int[]{10,8,6}, 3)); // 12
    }
}
