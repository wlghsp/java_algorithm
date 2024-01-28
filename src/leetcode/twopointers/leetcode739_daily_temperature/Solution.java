package leetcode.twopointers.leetcode739_daily_temperature;

import java.util.Stack;

public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        Stack<Integer> stk = new Stack<>();

        for (int currDay = 0; currDay < temperatures.length; currDay++) {
            while (!stk.isEmpty() && temperatures[currDay] > temperatures[stk.peek()]) {
                int prevDay = stk.pop();
                answer[prevDay] = currDay - prevDay;
            }
            stk.add(currDay);
        }

        return answer;
    }
}
