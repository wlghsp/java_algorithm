package programmers.level1.크레인인형뽑기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int m : moves) {
            for (int i = 0; i < board.length; i++){
                if (board[i][m-1] != 0) {
                    if (!list.isEmpty() && list.get(list.size() - 1) == board[i][m - 1]) {
                        answer+= 2;
                        list.remove(list.size() - 1);
                    } else {
                        list.add(board[i][m - 1]);
                    }
                    board[i][m-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
