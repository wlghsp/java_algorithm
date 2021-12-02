package codesignal;

/*
After becoming famous, the CodeBots decided to move into a new building together.
Each of the rooms has a different cost, and some of them are free,
but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious,
they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room,
your task is to return the total sum of all rooms that are suitable for the CodeBots
(ie: add up all the values that don't appear below a 0).

Example
    For

    matrix = [[0, 1, 1, 2],
              [0, 5, 0, 0],
              [2, 0, 3, 3]]

    the output should be
    solution(matrix) = 9.

[[1,1,1,0], 
 [0,5,0,1], 
 [2,1,3,10]]
 

9
1 1 1 5 1 10


Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.array.integer matrix

    A 2-dimensional array of integers representing the cost of each room in the building. A value of 0 indicates that the room is haunted.

    Guaranteed constraints:
    1 ≤ matrix.length ≤ 5,
    1 ≤ matrix[i].length ≤ 5,
    0 ≤ matrix[i][j] ≤ 10.

    [output] integer

    The total price of all the rooms that are suitable for the CodeBots to live in.

 */

public class MatrixElementsSum {

    static int solution(int[][] m) {
        int answer = 0;

        for (int j = 0; j < m[0].length; j++) { // 열을 기준으로 행을 체크 
            for (int i = 0; i < m.length; i++) {

                if (m[i][j] == 0) { // 0이 나올 경우에는 그 열은 종료하고 다음 열로 이동 
                    break;
                } else {
                    answer += m[i][j];
                }
                
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,1,1,0},
              {0,5,0,1},
              {2,1,3,10}};
        System.out.println(solution(arr));
    }
}
