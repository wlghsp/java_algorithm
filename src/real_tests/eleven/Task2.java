package real_tests.eleven;

import java.util.ArrayList;
import java.util.Collections;

/*
a , b 로 들어오는 문자열 

각 블록의 길이를 같아지게 문자를 더하는데 더하는 최소값을 구하라. 


*/

public class Task2 {

    // 블록 구분 후 길이 계산
    // 최대길이 찾기
    // 그 최대 길이에 맞게 각각 더해줌
    public int solution(String S) {
        int cnt = 0; // 더해주는 횟수
        int len = S.length(); // 문자열 길이
        ArrayList<Integer> list = new ArrayList<>(); // 블록길이 배열
        String[] stArr = S.split("");
        int j = 0;
        int start = 0;
        while (j < len - 1) {
            if (!stArr[j].equals(stArr[j + 1])) {
                list.add((j + 1) - start);
                start = j + 1;
            }
            j++;
        }
        int tmpLen = len;
        for (int i = 0; i < list.size(); i++) {
            tmpLen -= list.get(i);
        }
        list.add(tmpLen);
        int max = Collections.max(list);
        for (int i = 0; i < list.size(); i++) {
            if (max != list.get(i)) {
                cnt += max - list.get(i);
            }
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        return cnt;
    }

    public static void main(String[] args) {
        Task2 sol = new Task2();
        String array1 = "babaa"; // 1 1 1 2
        String array2 = "bbbab"; // 3 1 1 , 4
        String array3 = "bbbaaabbb"; //

        System.out.println(sol.solution(array1));
        System.out.println(sol.solution(array2));
        System.out.println(sol.solution(array3));

    }

}