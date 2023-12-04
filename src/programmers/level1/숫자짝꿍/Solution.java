package programmers.level1.숫자짝꿍;

import java.util.*;

public class Solution {
    public String solution(String X, String Y) {
        int l = 0, r = 0;
        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        StringBuilder sb = new StringBuilder();
        while (l < xArr.length && r < yArr.length) {
            if (xArr[l] > yArr[r]) {
                r++;
            } else if (xArr[l] < yArr[r]) {
                l++;
            } else {
                sb.append(xArr[l]);
                r++;
                l++;
            }
        }
        if (sb.length() == 0) return "-1";
        if (sb.toString().replace("0", "").isEmpty()) return "0";

        return sb.reverse().toString();
    }
}
