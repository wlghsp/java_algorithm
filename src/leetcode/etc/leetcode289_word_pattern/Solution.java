package leetcode.etc.leetcode289_word_pattern;

import java.util.*;

public class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");

        if (strs.length != pattern.length()) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String word = strs[i];
            char c = pattern.charAt(i);
            if (charToWord.containsKey(c) && !charToWord.get(c).equals(word)) return false;
            if (wordToChar.containsKey(word) && wordToChar.get(word) != c) return false;
            charToWord.put(c, word);
            wordToChar.put(word, c);
        }

        return true;
    }
}
