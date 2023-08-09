package programmers.코딩기초트레이닝.ad제거하기;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public String[] solution(String[] strArr) {
        List<String> list = Arrays.stream(strArr).filter(m -> !m.contains("ad")).collect(Collectors.toList());
        String[] answer = new String[list.size()];
        list.toArray(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"and","notad","abcd"})));
    }
}
