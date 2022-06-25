package real_tests.nhn_bigfoot;

import java.util.Arrays;

public class Problem2 {


    public int[][] solution(int[][] board, int[] arrows, int threshold) {
        int[][] answer = {};
        return answer;
    }


    public static void main(String[] args) {
        Problem2 s = new Problem2();

        int[][] board = {{0,0,0,1,0,0},
                         {0,0,0,0,0,0},
                         {0,0,1,1,0,0},
                         {0,1,0,1,0,0},
                         {0,0,0,1,0,0},
                         {1,1,1,1,0,0}};
        int[][] board2 = {{0,0,0,0,0},
                {1,1,0,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},};
        int[] arrows = {19, 16, 15};
        System.out.println(Arrays.deepToString(s.solution(board, arrows, 5)));
//        System.out.println(Arrays.deepToString(s.solution(board2, new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7}, 1)));

    }
}
