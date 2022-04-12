package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
풀이방법
문제 그대로 2중 반복문으로 파스칼 삼각형을 만든다.
1. 현재 입력해야 하는 인덱스가 라인의 양 끝일 경우 1을 입력한다.
2. 라인의 양 끝이 아닐 경우, 값을 구하기 위해 이전 라인에 있던 리스트 객체를 받아온다.
3. 받아 온 리스트 객체(윗 줄)에서 이전의 인덱스(j-1)와 현재 인덱스 (j)를 합한다.
4. 합한 정수를 현재 리스트(라인)에 추가한다.
5. 이렇게 반복문을 통해 생성된 한 리스트(라인)를 최종 리스트(result) 객체에 추가한다.

 */

public class Leetcode118_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
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

    public static void main(String[] args) {
        Leetcode118_PascalsTriangle T = new Leetcode118_PascalsTriangle();

        int numRows1 = 5;
        int numRows2 = 1;

        System.out.println(T.generate(numRows1).toString()); // [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        System.out.println(T.generate(numRows2).toString()); // [[1]]

    }
}
