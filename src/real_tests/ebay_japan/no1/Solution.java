package real_tests.ebay_japan.no1;

import java.util.*;

public class Solution {
    public int solution(int n, int[][] orders) {
        Arrays.sort(orders, Comparator.comparingInt(a -> a[0]));
        int totalDeliveries = 0;

        TreeMap<Integer, Integer> productionUntilDay = new TreeMap<>();
        int lastDay = orders[orders.length - 1][0];
        int accumulatedProduction = 0;
        for (int day = 0; day < lastDay; day++) {
            accumulatedProduction += n;
            productionUntilDay.put(day, accumulatedProduction);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        int index = 0;

        for (Map.Entry<Integer, Integer> entry : productionUntilDay.entrySet()) {
            int currentDay = entry.getKey();
            int maxProduction = entry.getValue();

            while (index < orders.length && orders[index][0] <= currentDay) {
                maxHeap.add(orders[index]);
                index++;
            }

            while (!maxHeap.isEmpty() && maxProduction > 0) {
                int[] order = maxHeap.poll();
                if (order[1] <= maxProduction) {
                    totalDeliveries += order[1];
                    maxProduction -= order[1];
                }
            }
        }


        return totalDeliveries;
    }

}
