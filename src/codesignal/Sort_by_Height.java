package codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Some people are standing in a row in a park. 
There are trees between them which cannot be moved. 
Your task is to rearrange the people by their heights in a non-descending order without moving the trees. 
People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer a

    If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.

    Guaranteed constraints:
    1 ≤ a.length ≤ 1000,
    -1 ≤ a[i] ≤ 1000.

    [output] array.integer

    Sorted array a with all the trees untouched.


*/

public class Sort_by_Height {
    
    
    static Integer[] solution(int[] a) {


        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) { // -1의 인덱스 담기 
            if (a[i]== -1) {
                indexList.add(i);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) { // -1을 제외하고 list에 담는다. 
            if (a[i] != -1) {
                list.add(a[i]);
            }
        }

        Collections.sort(list); // -1이 없는 숫자들을 정렬한다. 

        for (int i = 0; i < indexList.size(); i++) {
            list.add(indexList.get(i), -1); // -1을 원래의 위치에 넣어준다.
        }
        
        Integer[] answer = list.toArray(new Integer[list.size()]); //list를 Integer배열로 변환

        
        return answer;

    }
    
    
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{-1, 150, 190, 170, -1, -1, 160, 180})));
    }
}
