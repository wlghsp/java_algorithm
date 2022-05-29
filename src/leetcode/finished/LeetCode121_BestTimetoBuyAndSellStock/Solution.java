package leetcode.finished.LeetCode121_BestTimetoBuyAndSellStock;

public class Solution {


    public int maxProfit(int[] prices) {
        int profit = 0;
        int min_price = Integer.MAX_VALUE;
        for (int price : prices) {
            min_price = Math.min(min_price, price);
            profit = Math.max(profit, price - min_price);
        }

        return profit;

    }

    public static void main(String[] args) {
        Solution S = new Solution();
        int[] p = {7, 1, 5, 3, 6, 4};

        System.out.println(S.maxProfit(p)); // 5
    }
}