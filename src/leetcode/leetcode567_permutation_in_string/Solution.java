package leetcode.leetcode567_permutation_in_string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 슬라이딩 윈도우
     */
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1map = new int[26];
        int[] s2map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }

        // s2map 을 슬라이딩 윈도우로 이동
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1map, s2map)) {
                return true;
            }
            // 슬라이딩 윈도우 이동, 슬라이딩 윈도우의 사이즈는 s1
            // 왼쪽 문자를 빼고 오른쪽 문자열 추가
            s2map[s2.charAt(i + s1.length()) - 'a']++;
            s2map[s2.charAt(i) - 'a']--;
        }

        return matches(s1map, s2map);
    }


    /**
     * 배열 사용 (HashMap 대신)
     */
    public boolean checkInclusion3(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2map = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                s2map[s2.charAt(i + j) - 'a']++;
            }
            if (matches(s1map, s2map)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 2. hashmap 사용 빈도 비교
     * s2의 부분 문자열의 문자들이 s1의 문자들과 같은 빈도를 갖음을 확인
     */
    public boolean checkInclusion2(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> s1map = charCount(s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (mapCompare(s1map, charCount(s2.substring(i, i + s1.length())))) {
                return true;
            }
        }
        return false;
    }

    // 문자열의 문자마다의 빈도를 가진 해시맵 생성
    private Map<Character, Integer> charCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }

    // 해시맵 일치 여부 비교
    private boolean mapCompare(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Character c : map1.keySet()) {
            if (map1.get(c) - map2.getOrDefault(c, -1) != 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * 1. 정렬하여 문자열 일치여부 비교
     * 둘다 정렬해서 같은지 확인
     * if sorted(s1) == sorted(s2)
     */
    public boolean checkInclusion1(String s1, String s2) {
        if (s2.length() < s1.length()) return false;

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            s1 = sort(s1);
            if (s1.equals(sort(s2.substring(i, i + s1.length())))) {
                return true;
            }
        }
        return false;
    }

    private String sort(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
