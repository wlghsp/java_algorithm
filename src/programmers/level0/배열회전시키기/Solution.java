package programmers.level0.배열회전시키기;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    final String DIR_RIGHT = "right";


    public int[] solution(int[] numbers, String direction) {
       List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

       if (direction.equals(DIR_RIGHT)) {
           list.add(0, list.get(list.size() - 1));
           list.remove(list.size() - 1);
       } else {
           list.add(list.size(), list.get(0));
           list.remove(0);
       }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public int[] solution3(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (DIR_RIGHT.equals(direction)) {
                answer[i] = numbers[i == 0 ? numbers.length - 1: i-1];
            } else {
                answer[i] = numbers[i == numbers.length - 1 ? 0 : i + 1];
            }
        }
        return answer;
    }


    public int[] solution2(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (DIR_RIGHT.equals(direction)) {

                if (i < numbers.length - 1) {
                    answer[i + 1] = numbers[i];
                } else {
                    answer[0] = numbers[i];
                }
            } else {
                if (i == 0)
                    answer[numbers.length - 1] = numbers[0];
                else answer[i - 1] = numbers[i];

            }
        }
        return answer;
    }


    // 내 풀이
    public int[] solution1(int[] numbers, String direction) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i : numbers) {
            dq.add(i);
        }

        if (direction.equals("left")) {
            int tmp = dq.poll();
            dq.addLast(tmp);
        } else if (direction.equals("right")) {
            int tmp = dq.pollLast();
            dq.addFirst(tmp);
        }
        int len = dq.size();
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = dq.poll();
        }

        return answer;
    }



    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,3}, "right"))); // [3,1,2]
        System.out.println(Arrays.toString(s.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"))); // [455, 6, 4, -1, 45, 6, 4]
    }
}
