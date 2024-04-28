package leetcode.backtracking.leetcode17_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    private Map<Character, String> digitToChar = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        List<String> ans = new ArrayList<>();
        String cur = "";
        backtrack(digits, ans, cur, 0);
        return ans;
    }

    private void backtrack(String digits, List<String> ans, String cur, int index) {
        if (cur.length() == digits.length()) {
            ans.add(cur);
        } else {
            if (index < digits.length()) {
                String digit = digitToChar.get(digits.charAt(index));
                for (char c : digit.toCharArray()) {
                    backtrack(digits, ans, cur + c, index + 1);
                }
            }
        }
    }
}
