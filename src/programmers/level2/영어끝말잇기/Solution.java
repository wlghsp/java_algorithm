package programmers.level2.영어끝말잇기;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0, 0};
        Set<String> set = new HashSet<>();
        String lastWord = "";
        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i])) {
                return new int[]{i % n + 1, i / n + 1};
            }

            if (i > 0 && !set.isEmpty()) {
                if (lastWord.charAt(lastWord.length() - 1) != words[i].charAt(0)) {
                    return new int[]{i % n + 1, i / n + 1};
                }
            }
            lastWord = words[i];
            set.add(words[i]);
        }

        return answer;
    }
}
