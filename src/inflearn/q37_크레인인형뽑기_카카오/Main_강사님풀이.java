package inflearn.q37_크레인인형뽑기_카카오;

import java.util.Scanner;
import java.util.Stack;

public class Main_강사님풀이 {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos-1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stk.isEmpty() && tmp == stk.peek()) {
                        answer += 2;
                        stk.pop();
                    } else stk.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main_강사님풀이 T = new Main_강사님풀이();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }
}
