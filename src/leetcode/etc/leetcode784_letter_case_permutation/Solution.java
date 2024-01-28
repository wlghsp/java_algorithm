package leetcode.etc.leetcode784_letter_case_permutation;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backTracking(result, s.toCharArray(), 0);
        return result;
    }

    private void backTracking(List<String> result, char[] chars, int i) {
        if (i == chars.length) {
            result.add(new String(chars));
            return;
        }

        char c = chars[i];
        if (Character.isLetter(c)) {
            backTracking(result, chars, i + 1);
            if (c >= 'a' && c <= 'z'){
                chars[i] = Character.toUpperCase(c);
                backTracking(result, chars, i + 1);
            } else if (c >= 'A' && c <= 'Z') {
                chars[i] = Character.toLowerCase(c);
                backTracking(result, chars, i + 1);
            }
        } else {
            backTracking(result, chars, i + 1);
        }
    }
}
