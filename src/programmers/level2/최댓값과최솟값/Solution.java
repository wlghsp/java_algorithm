package programmers.level2.최댓값과최솟값;

import java.util.Arrays;

public class Solution {

    public String solution(String s) {
        String[] splitArr = s.split(" ");
        int[] arr = Arrays.stream(splitArr)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        return arr[0] + " " + arr[arr.length - 1];
    }
}
