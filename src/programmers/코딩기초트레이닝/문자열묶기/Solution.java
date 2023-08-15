package programmers.코딩기초트레이닝.문자열묶기;

public class Solution {

    public int solution(String[] strArr) {
        int[] cnt = new int[31];
        for (int i = 1; i <= 30; i++) {
            for (String s : strArr) {
                if (s.length() == i) {
                    cnt[i]++;
                }
            }
        }
        int maxLen = 0;
        for (int i = 1; i <= 30; i++) {
            maxLen = Math.max(maxLen, cnt[i]);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"a","bc","d","efg","hi"})); // 2
    }
}
