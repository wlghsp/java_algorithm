package leetcode.leetcode58_length_of_last_word;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int lengthOfLastWord(String s) {
        int i = s.length() - 1, length = 0;
        // 1. 공백이 끝나고 단어나 나오는 지점까지 i 이동
        while (s.charAt(i) == ' ') {
            i -= 1;
        }
        // 2. 공백이 아닌 단어에서 length를 증가시키고, i는 감소 시킴
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        // 3. length 반환
        return length;
    }

    public int lengthOfLastWord1(String s) {
        String trimmed = s.trim();
        int cnt = 0;
        for (int i = trimmed.length() - 1; i >= 0; i--) {
            if (trimmed.charAt(i) != ' ') {
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }
}
