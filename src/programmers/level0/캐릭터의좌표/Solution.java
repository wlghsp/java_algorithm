package programmers.level0.캐릭터의좌표;

import java.util.Arrays;

public class Solution {

    public int[] solution(String[] keyinput, int[] board) {
        int[] point = {0, 0};
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        for (String s : keyinput) {
            switch (s) {
                case "up":
                    point[1]++;
                    break;
                case "down":
                    point[1]--;
                    break;
                case "left":
                    point[0]--;
                    break;
                case "right":
                    point[0]++;
                    break;

            }
            if (point[0] > maxX) point[0] = maxX;
            else if(point[0] < -maxX) point[0] = -maxX;
            else if (point[1] > maxY) point[1] = maxY;
            else if (point[1] < -maxY) point[1] = -maxY;
        }

        return point;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11}))); // [2,1]
        System.out.println(Arrays.toString(s.solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9}))); // [0,-4]

    }
}
