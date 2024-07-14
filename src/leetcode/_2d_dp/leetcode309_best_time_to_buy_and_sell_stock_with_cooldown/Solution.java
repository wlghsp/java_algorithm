package leetcode._2d_dp.leetcode309_best_time_to_buy_and_sell_stock_with_cooldown;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int sell = 0, prevSell = 0, buy = Integer.MIN_VALUE, prevBuy;

        for (int price : prices) {
            prevBuy = buy;
            buy = Math.max(prevSell - price, prevBuy); // 이전에 팔고 현재 구매, 이전에 구매하고 현재 휴식
            prevSell = sell;
            sell = Math.max(prevBuy + price, prevSell); // 이전에 사고 현재 판 경우, 이전에 팔고 현재 휴식
        }

        return sell;
    }

}
