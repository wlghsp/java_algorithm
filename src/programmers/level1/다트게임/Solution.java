package programmers.level1.다트게임;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(String dartResult) {
        List<Integer> stk = new ArrayList<>();

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            switch (c) {
                case 'S' -> {}
                case 'D' -> {
                    Integer num = stk.get(stk.size() - 1);
                    stk.set(stk.size() - 1, num * num);
                }
                case 'T' -> {
                    Integer num = stk.get(stk.size() - 1);
                    stk.set(stk.size() - 1, num * num * num);
                }
                case '*' -> {
                    if (stk.size() >= 2) {
                        int num1 = stk.get(stk.size() - 2);
                        int num2 = stk.get(stk.size() - 1);
                        stk.set(stk.size() - 2, num1 * 2);
                        stk.set(stk.size() - 1, num2 * 2);
                    } else if (stk.size() == 1) {
                        int num = stk.get(0);
                        stk.set(0, num * 2);
                    }
                }
                case '#' -> {
                    int num = stk.get(stk.size() - 1);
                    stk.set(stk.size() - 1, -num);
                }

                default -> {
                    if (i >= 1 && dartResult.charAt(i - 1) == '1') {
                        stk.set(stk.size() - 1, 10);
                    } else {
                        stk.add(c - '0');
                    }
                }
            }
        }



        return stk.stream().mapToInt(Integer::intValue).sum();
    }
}
