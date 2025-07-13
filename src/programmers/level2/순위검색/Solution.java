package programmers.level2.순위검색;

import java.util.*;

public class Solution {

    public int[] solution(String[] info, String[] query) {
        List<Integer> answers = new ArrayList<>();
        return answers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }



}
