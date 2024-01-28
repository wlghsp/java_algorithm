package leetcode.slidingwindow.leetcode3_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * Time: O(N)
     * Space: O(N)
     */
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int l = 0, r = 0;
        Set<Character> set = new HashSet<>();

        while (l < s.length() && r < s.length()) {
            if (!set.contains(s.charAt(r))) { // 처음 나온 문자
                set.add(s.charAt(r));
                answer = Math.max(answer, r - l + 1);
                r++;
            } else { // 이미 있는 문자이면 해당 문자는 중복으로 삭제한다.
                set.remove(s.charAt(l));
                l++;
            }
        }

        return answer;
    }
}
