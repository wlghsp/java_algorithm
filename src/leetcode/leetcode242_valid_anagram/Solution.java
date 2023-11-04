package leetcode.leetcode242_valid_anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Time: O(S+T)
     * Space: O(S+T)
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (Character c : countS.keySet()) {
            if (!countS.get(c).equals(countT.getOrDefault(c, 0))) return false;
        }
        return true;
    }

    /**
     * Time: O(n log n)
     * Space: O(1)
     */
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] strArr1 = s.toCharArray();
        char[] strArr2 = t.toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);

        for (int i = 0; i < s.length(); i++) {
            if (strArr1[i] != strArr2[i]) return false;
        }

        return true;
    }
}
