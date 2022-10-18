package programmers.level0.특이한정렬;

import java.util.Arrays;

class Num implements Comparable<Num> {
    public int distance;
    public int num;

    Num(int distance, int num) {
        this.distance = distance;
        this.num = num;
    }

    @Override
    public int compareTo(Num o) {
        if (this.distance == o.distance) {
            return o.num - this.num;
        }
        return this.distance - o.distance;
    }
}

public class Solution {

    public int[] solution(int[] numList, int n) {

        return Arrays.stream(numList)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] solution1(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Num[] nums = new Num[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            int dist = Math.abs(n - numlist[i]);
            nums[i] = new Num(dist, numlist[i]);
        }
        Arrays.sort(nums);
        int i = 0;
        for (Num num : nums) answer[i++] = num.num;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));  // [4, 5, 3, 6, 2, 1]
        System.out.println(Arrays.toString(s.solution(new int[]{10000,20,36,47,40,6,10,7000}, 30)));  // [36, 40, 20, 47, 10, 6, 7000, 10000]
    }
}
