package programmers.level1.카드뭉치;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Deque<String> dq1 = new LinkedList<>();
        for (String s : cards1) {
            dq1.offerLast(s);
        }
        Deque<String> dq2 = new LinkedList<>();
        for (String s : cards2) {
            dq2.offerLast(s);
        }
        for (String s : goal) {
            if (!dq1.isEmpty() && (dq1.peek()).equals(s)) {
                dq1.pollFirst();
            } else if (!dq2.isEmpty() && (dq2.peek()).equals(s)) {
                dq2.pollFirst();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
