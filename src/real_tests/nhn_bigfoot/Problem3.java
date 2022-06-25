package real_tests.nhn_bigfoot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {

    /*
    n명의 사람, m 가지 종류의 언어 1~m까지 번호
    각자 1개 이상의 언어 사용
    두 명이 대화하기 위해서는 서로 공통으로 능숙한 언어가 존재하거나, 둘 사이를 통역해 줄 사람이 필요하다.




     */

    public int[] solution(int m, String[] people, String[] pairs) {
        int[] answer = {};
        List<List<String>> pList = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            pList.add(new ArrayList<>());
        }
        List<String> list;
        for (int i =0; i < people.length; i++) {
            String[] arr = people[i].split(" ");
            list = pList.get(i);
            for (String s : arr) {
                list.add(s);
            }
        }

        for (String pair : pairs) {
            String[] p = pair.split(" ");
            int idx1 = p[0].charAt(0) - 65;
            int idx2 = p[0].charAt(0) - 65;


        }

        return answer;
    }


    public static void main(String[] args) {
        Problem3 s = new Problem3();
        System.out.println(Arrays.toString(s.solution(9, new String[]{"A 1 2", "B 2 3 4", "C 4 5", "D 5 6 7", "E 6 7 8", "F 8 9"}, new String[]{"A B", "C F"}))); // 0, 2
//        System.out.println(Arrays.toString(s.solution(9, new String[]{"A 1 2", "B 4 9", "C 4 5", "D 5 6 7", "E 6 7 8", "F 8 9"}, new String[]{"A B", "C F"}))); // -1,1

    }
}
