package leetcode.etc.leetcode344_reverse_string;

public class Solution {

    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (l <= r) {
            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;
        }
    }

    public void reverseString1(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < (s.length / 2)) {
            swap(s, i, j);
            i++;
            j--;
        }
    }
    private void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
