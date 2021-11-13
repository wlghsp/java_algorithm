package eleven;

import java.util.ArrayList;
import java.util.Arrays;

/*
오름차순 으로 일러어진 배열 
N개

숫자 대로 그 안에서 숫자 번 만큼 나오도록 더하거나 빼는 작업을 하고 
그 작업의 최소횟수. 



*/

public class Task3 {

    // 블록 구분 후 길이 계산
    // 최대길이 찾기
    // 그 최대 길이에 맞게 각각 더해줌
    public int solution(int[] A) {

        return 0;
    }

    public static void main(String[] args) {
        Task3 sol = new Task3();
        int[] array1 = new int[] { 1, 1, 1, 3, 4, 4 };
        int[] array2 = new int[] { 1, 2, 2, 2, 5, 5, 5, 8 };
        int[] array3 = new int[] { 1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4 };
        int[] array4 = new int[] { 10, 10, 10 };
        System.out.println(sol.solution(array1));
        System.out.println(sol.solution(array2));
        System.out.println(sol.solution(array3));
        System.out.println(sol.solution(array4));

    }

}