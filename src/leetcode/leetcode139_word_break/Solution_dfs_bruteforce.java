package leetcode.leetcode139_word_break;

import java.util.*;


public class Solution_dfs_bruteforce {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, new HashSet<>(wordDict), 0);
    }

    public boolean dfs(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end))
                    && dfs(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution_dfs_bruteforce s = new Solution_dfs_bruteforce();
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
