package programmers.코딩기초트레이닝.배열의원소만큼추가하기;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> solution(int[] arr) {
        // flatmap 중복된 스트림을 1차원으로 평면화
        return Arrays.stream(arr)
                .boxed()
                .flatMap(num -> Collections.nCopies(num, num).stream())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{5, 1, 4}));
    }
}
