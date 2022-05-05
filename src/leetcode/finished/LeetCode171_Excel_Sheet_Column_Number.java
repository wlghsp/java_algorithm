package leetcode.finished;

public class LeetCode171_Excel_Sheet_Column_Number {

    public int titleToNumber(String columnTitle) {

        int ans = 0;

        for (char c : columnTitle.toCharArray()) {
            ans = ans * 26 + c - 64;
        }
        return ans;
    }


}
