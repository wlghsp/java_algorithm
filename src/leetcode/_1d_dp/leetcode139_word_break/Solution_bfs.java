package leetcode._1d_dp.leetcode139_word_break;

import java.util.*;


public class Solution_bfs {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[s.length()];
        queue.add(0);
        while (!queue.isEmpty()) {
            int start = queue.remove();
            if (visited[start] == 0) {
                for (int end = start + 1; end <= s.length(); end++) {
                    if (wordDictSet.contains(s.substring(start, end))) {
                        queue.add(end);
                        if (end == s.length()) {
                            return true;
                        }
                    }
                }
            }
            visited[start]  = 1;
        }
        return false;
    }



    public static void main(String[] args) {
        Solution_bfs s = new Solution_bfs();
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
