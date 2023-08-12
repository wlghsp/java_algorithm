package leetcode.leetcode139_word_break;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Solution_dynamic_programming {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);

        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true;

        for (int end = 1; end <= s.length(); end++) {
            for (int start = 0; start < end; start++) {
                if (dp[start] && wordDictSet.contains(s.substring(start, end))) {
                    dp[end] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        Solution_dynamic_programming s = new Solution_dynamic_programming();
        System.out.println(s.wordBreak("leetcode", Arrays.asList("leet", "code"))); // true
        System.out.println(s.wordBreak("applepenapple", Arrays.asList("apple", "pen"))); // true
        System.out.println(s.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat"))); // false
        System.out.println(s.wordBreak("bb", Arrays.asList("a","b","bbb","bbbb"))); // true
        System.out.println(s.wordBreak("cars", Arrays.asList("car","ca","rs"))); // true
        System.out.println(s.wordBreak("aaaaaaa", Arrays.asList("aaaa","aaa"))); // true
        System.out.println(s.wordBreak("cbca", Arrays.asList("bc","ca"))); // false
        System.out.println(s.wordBreak("ccbb", Arrays.asList("bc","cb"))); // false
        System.out.println(s.wordBreak("catsandogcat", Arrays.asList("cats","dog","sand","and","cat","an"))); // true
    }
}
