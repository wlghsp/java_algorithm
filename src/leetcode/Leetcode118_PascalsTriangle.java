package leetcode;

import java.util.ArrayList;
import java.util.List;


public class Leetcode118_PascalsTriangle {

    public List<List<Integer>> generate1(int numRows) {
        /*
            1. 이중포문을 돌리는데 바깥 포문은 numRows 만큼 돌리고 안쪽 포문은 바깥 포문의 인덱스+1 만큼 돌린다.
            2. 바깥 포문에서 해당 행을 담을 list를 하나 생성한다.
            2. 안쪽 포문 인덱스의 처음과 끝은 1로 list에 담아준다.
            3. 그리고 나머지 안쪽 포문 인덱스에서는  그 전 행에서 현 행 인덱스 숫자의 앞 인덱스와 현 인덱스숫자와 같은 값을 더하고 둘을 더한 결과를 리스트에 담는다.
            4. 안쪽 포문이 끝나고 만들어진 행 리스트를 결과리스트에 담아준다.
         */

        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int prev = answer.get(i - 1).get(j - 1);
                    int next = answer.get(i - 1).get(j);
                    list.add(prev + next);
                }
            }
            answer.add(list);
        }
        return answer;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(1);
            if (i != 0){
                row.add(1);
            }
            for (int j = 0; j < i -1; j++) {
                List<Integer> before = answer.get(i-1); // 전 행을 가져온다.
                row.add(before.get(j) + before.get(j+1));
            }

            row.add(1); // 끝은 0을 넣어준다.
            answer.add(row);
        }

        return answer;
    }

    public static void main(String[] args) {
        Leetcode118_PascalsTriangle T = new Leetcode118_PascalsTriangle();

        int numRows1 = 5;
        int numRows2 = 1;

        System.out.println(T.generate(numRows1).toString()); // [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        System.out.println(T.generate(numRows2).toString()); // [[1]]

    }
}
