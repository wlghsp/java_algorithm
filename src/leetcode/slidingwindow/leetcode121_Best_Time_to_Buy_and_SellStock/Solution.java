package leetcode.slidingwindow.leetcode121_Best_Time_to_Buy_and_SellStock;

public class Solution {

    /**
     * Time: O(n)
     * Space: O(1)
     */
    public int maxProfit(int[] prices) {
        int answer = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            answer = Math.max(answer, prices[i] - min);
        }

        return answer;
    }
}
