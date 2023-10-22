package leetcode.leetcode242_valid_anagram;

import java.util.Arrays;

public class Solution {

    public boolean isAnagram(String s, String t) {
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
