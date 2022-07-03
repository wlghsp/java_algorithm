package inflearn.stack_queue.q37_크레인인형뽑기_카카오;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        for (int c : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][c -1] != 0) {
                    int num = board[i][c-1];
                    board[i][c-1] = 0;

                    if (stk.contains(num)){
                        if (stk.peek() == num){
                            stk.pop();
                            answer+= 2;
                        } else stk.push(num);
                    } else {
                        stk.push(num);
                    }

                    break;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
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
