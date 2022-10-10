package programmers.level0.중복된문자제거;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Solution {

    public String solution1(String my_string) {
        String answer = "";
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            hs.add(my_string.charAt(i));
        }
        Iterator iter = hs.iterator();
        while (iter.hasNext()) answer += iter.next();
        return answer;
    }

    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining()); // 문자열 결합
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("people")); // "peol"
        System.out.println(s.solution("We are the world")); // "We arthwold"
    }
}
