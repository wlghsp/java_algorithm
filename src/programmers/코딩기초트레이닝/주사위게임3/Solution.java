package programmers.코딩기초트레이닝.주사위게임3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 6;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : new int[]{a, b, c, d}) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Iterator<Integer> iter = map.keySet().iterator();
        if (map.size() == 1) {
            return 1111 * a;
        }
        if (map.size() == 2) {
            int p = iter.next();
            int q = iter.next();
            int pValue = map.get(p);
            int qValue = map.get(q);
            if (pValue == qValue) {
                return (p + q) * Math.abs(p - q);
            } else if (pValue == 3) {
                return (10 * p + q) * (10 * p + q);
            } else {
                return (10 * q + p) * (10 * q + p);
            }
        }

        if (map.size() == 3) {
            int p = iter.next();
            int q = iter.next();
            int r = iter.next();
            int pValue = map.get(p);
            int qValue = map.get(q);
            if (pValue == 2) {
                return q * r;
            } else if (qValue == 2) {
                return p * r;
            } else {
                return p * q;
            }
        }

        while (iter.hasNext()) {
            int key = iter.next();
            answer = Math.min(answer, key);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2,2,2,2)); // 2222
        System.out.println(s.solution(4,1,4,4)); // 1681
        System.out.println(s.solution(6,3,3,6)); // 27
        System.out.println(s.solution(2,5,2,6)); // 30
        System.out.println(s.solution(6,4,2,5)); // 2

    }
}
