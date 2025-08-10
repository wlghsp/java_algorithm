package programmers.level2.이모티콘할인행사;

import java.util.Arrays;

public class Solution {
    private int[][] users;
    private int[] emoticons;
    private int maxJoinCnt;
    private int maxTotalCost;

    public int[] solution(int[][] users, int[] emoticons) {
        this.users = users;
        this.emoticons = emoticons;
        maxJoinCnt = 0;
        maxTotalCost = 0;
        recur(new int[emoticons.length], 0);

        return new int[]{maxJoinCnt, maxTotalCost};
    }

    private void recur(int[] picked, int idx) {
        if (idx == emoticons.length) {
            calc(picked);
            return;
        }

        for (int rate : new int[]{10, 20, 30, 40}) {
            picked[idx] = rate;
            recur(picked, idx + 1);
        }
    }

    private void calc(int[] picked) {
        int joinCnt = 0;
        double totalCost = 0;
        for (int[] user : users) {
            int userMinRate = user[0];
            int subscribeThreshold = user[1];
            double spend = 0;
            for (int i = 0; i < emoticons.length; i++) {
                int rate = picked[i];
                if (rate >= userMinRate) {
                    spend += emoticons[i] * (1 - rate / 100.0);
                }
            }

            if (spend >= subscribeThreshold) {
                joinCnt++;
            } else {
                totalCost += spend;
            }
        }

        if (joinCnt > maxJoinCnt || (joinCnt == maxJoinCnt && totalCost > maxTotalCost)) {
            maxJoinCnt = joinCnt;
            maxTotalCost = (int) totalCost;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(new int[][]{{40, 10000}, {25, 10000}}, new int[]{7000, 9000});
        System.out.println(Arrays.toString(result));
    }
}
