package programmers.코딩기초트레이닝.전국대회선발고사;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] arr = new int[3];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < rank.length; j++) {
                if (list.get(i) == rank[j]) {
                    arr[i] = j;
                }
            }
        }
        return 10000 * arr[0] + 100 * arr[1] + arr[2];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 7, 2, 5, 4, 6, 1}
        , new boolean[]{false, true, true, true, true, false, false})); // 20403
    }
}
