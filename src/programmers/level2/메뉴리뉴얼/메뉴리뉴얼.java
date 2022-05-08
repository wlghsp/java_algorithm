package programmers.level2.메뉴리뉴얼;

import java.util.*;

public class 메뉴리뉴얼 {

    /*
    1. 조합을 만들 땐 정렬을 고려하자
    2. HashMap의 기본 형태는 NAME:COUNT 키(이름)과 값(카운트)
    3. 재귀 = 탈출조건 + 수행동작
     */

    List<String> answerList = new ArrayList<>();
    Map<String, Integer> hashMap = new HashMap<>();
    // 1. Hash를 활용한 Solution
    public String[] solution(String[] orders, int[] course) {
        // 1. 각 order 정렬
        for (int i = 0; i < orders.length; i++) {
            // orders[i]에 있는 String문자열을 정렬을 위해 char배열로 바꿈
            char[] arr = orders[i].toCharArray();
            // 배열 정렬
            Arrays.sort(arr);
            // String 변환하여 orders에 저장
            orders[i] = String.valueOf(arr);

        }
        // 2. 각 order를 기준으로 courseLength만큼의 조합 만들기
        for (int courseLength : course) {
            for (String order : orders) {
                combination("", order, courseLength);
            }
            // 3. 가장 많은 조합을 answer에 저장한다.
            if (!hashMap.isEmpty()) {
            // 최댓값을 찾기 쉬우므로 리스트로 변형
            List<Integer> countList = new ArrayList<>(hashMap.values());
            int max = Collections.max(countList); // max 값 구하기

            if (max > 1) { // 2개 이상일때만 조합이 유효하므로 1보다 클 때
                for(String key : hashMap.keySet()) {
                    if (hashMap.get(key) == max) answerList.add(key);
                }
            }
            hashMap.clear();
        }
    }
        Collections.sort(answerList);


        String[] answer = new String[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public void combination(String order, String others, int count) {
        // 탈출 조건 count == 0
        if (count == 0) {
            hashMap.put(order, hashMap.getOrDefault(order, 0) + 1);
            return;
        }
        // 수행 동작 : 0부터 length까지 조합
        for (int i = 0; i < others.length(); i++) {
            combination(order + others.charAt(i), others.substring(i + 1), count-1);
        }
    }

    public static void main(String[] args) {
        메뉴리뉴얼 T = new 메뉴리뉴얼();
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        System.out.println(Arrays.toString(T.solution(orders, course)));
    }
}
