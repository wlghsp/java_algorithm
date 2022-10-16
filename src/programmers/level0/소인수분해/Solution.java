package programmers.level0.소인수분해;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }


    public int[] solution1(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }

        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(12)));  // [2,3]
        System.out.println(Arrays.toString(s.solution(17)));  // [17]
        System.out.println(Arrays.toString(s.solution(420))); // [2,3,5,7]
    }
}
