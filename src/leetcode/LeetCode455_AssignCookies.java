package leetcode;

import java.util.Arrays;

public class LeetCode455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int content = 0, i = 0;

        for (int j = 0; j < s.length; j++) {
            if (i == g.length) {
                break;
            }
            if (s[j] >= g[i]){
                content++;
                i++;
            }
        }

        return content;

    }


}
