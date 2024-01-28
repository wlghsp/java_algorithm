package leetcode.slidingwindow.leetcode424_Longest_Repeating_Character_Replacement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int answer = 0;
        int lt = 0;
        for (int rt = 0; rt < s.length(); rt++) {
            map.put(s.charAt(rt), map.getOrDefault(s.charAt(rt), 0) + 1);

            int windowLength = rt - lt + 1;
            Integer maxCount = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();

            if ((windowLength - maxCount) > k) {
                map.put(s.charAt(lt), map.get(s.charAt(lt)) - 1);
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    // neetcode 풀이 참고
    public int characterReplacement1(String s, int k) {
        int[] arr = new int[26];
        int ans = 0;
        int max = 0;

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            max = Math.max(max, arr[s.charAt(r) - 'A']);
            if (r - l + 1 - max > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
