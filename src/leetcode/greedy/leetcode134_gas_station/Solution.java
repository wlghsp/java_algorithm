package leetcode.greedy.leetcode134_gas_station;

import java.util.Arrays;

public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) return -1;

        int answer = 0;
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];

            if (total < 0) {
                total = 0;
                answer++;
            }
        }

        return answer;
    }
}

