package programmers.level1.모의고사;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    private int getPicked(int person, int problem) {
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    }

    public int[] solution(int[] answers) {
        int[] corrects = new int[3];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem++) {
            int answer = answers[problem];
            for (int person = 0; person < 3; person++) {
                int picked = getPicked(person, problem);
                if (answer == picked) {
                   if (++corrects[person] > max) {
                       max = corrects[person];
                   }
                }
            }
        }

        final int maxCorrects = max;
        return IntStream.range(0, 3)
                .filter(i -> corrects[i] == maxCorrects)
                .map(i -> i + 1)
                .toArray();
    }

    public int[] solution1(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (person1[i % person1.length] == answers[i]) p1++;
            if (person2[i % person2.length] == answers[i]) p2++;
            if (person3[i % person3.length] == answers[i]) p3++;
        }

        int max = Math.max(p3, Math.max(p1, p2));

        List<Integer> list = new ArrayList<>();
        if (max == p1) list.add(1);
        if (max == p2) list.add(2);
        if (max == p3) list.add(3);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
