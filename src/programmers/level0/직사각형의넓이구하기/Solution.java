package programmers.level0.직사각형의넓이구하기;

public class Solution {

    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for (int[] dot : dots) {
            if (dot[0] > maxX) maxX = dot[0];
            if (dot[1] > maxY) maxY = dot[1];
            if (dot[0] < minX) minX = dot[0];
            if (dot[1] < minY) minY = dot[1];
        }
        answer = (maxX - minX) * (maxY - minY);

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{1,1}, {2,1}, {2,2}, {1,2}})); // 1
        System.out.println(s.solution(new int[][]{{-1,-1}, {1,1}, {1,-1}, {-1,1}})); // 4
    }
}
