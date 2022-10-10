package programmers.level0.A로B만들기;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    // 내 풀이
    public int solution1(String before, String after) {
        int answer = 0;
        char[] arr = after.toCharArray();
        int[] count1 = new int[arr.length];
        int[] count2 = new int[arr.length];
        for (int i = 0; i < before.length(); i++) {
            char c = before.charAt(i);
            char d = after.charAt(i);
            for (int j = 0; j < arr.length; j++) {
                if (c == arr[j]) count1[j]++;
                if (d == arr[j]) count2[j]++;
            }
        }
        return Arrays.equals(count1, count2) ? 1 : 0;
    }

    // 다른 풀이
    public int solution(String before, String after) {
        return isCheck(getList(before), getList(after)) ? 1 : 0;
    }

    private boolean isCheck(List<Integer> first, List<Integer> second) {
        for (int i = 0; i < first.size(); i++) {
            if (first.get(i) != second.get(i)) {
                return false;
            }
        }
        return true;
    }

    // 문자의 빈도만 리스트로 반환, 문자는 없음
    private List<Integer> getList(String str) {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s))
                .values()
                .stream()
                .map(List::size)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("olleh", "hello")); // 1
        System.out.println(s.solution("allpe", "apple")); // 0
    }
}
