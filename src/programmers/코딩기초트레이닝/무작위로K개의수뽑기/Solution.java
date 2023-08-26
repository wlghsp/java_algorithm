package programmers.코딩기초트레이닝.무작위로K개의수뽑기;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr, int k) {
        return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1))
                        .limit(k)
                        .toArray();
    }

    public int[] solution2(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        Set<Integer> set = new LinkedHashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        int i = 0;
        for (Integer num : set) {
            if (i < k) {
                answer[i++] = num;
            } else {
                break;
            }
        }
        return answer;
    }

    public int[] solution1(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (!list.contains(j)) {
                list.add(j);
            }
        }
        for (int i = 0; i < Math.min(list.size(), k); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1}, 2))); // [1, -1]
    }
}
