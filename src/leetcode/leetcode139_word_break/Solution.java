package leetcode.leetcode139_word_break;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        String joined = String.join("", wordDict);
        if (s.equals(joined)) return true;
        Collections.sort(wordDict);

        for (String w : wordDict) {
          if (s.contains(w)) {
              String[] strArr = s.split("\\Q" + w + "\\E");
              int cnt = 0;
              for (String e : strArr) {
                  if (!e.isEmpty() && wordDict.contains(e)) {
                      cnt++;
                  }
              }
              if (strArr.length == cnt) return true;
          }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
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
