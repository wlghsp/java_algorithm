package programmers.level1.체육복;

import java.util.*;

public class Solution {

    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(lost);

        // 1.체육복 학생 map 초기화
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }
        // 2. 여분 가진 학생 2로
        for (int i : reserve) {
            map.put(i, 2);
        }
        // 3. 체육복 도난 당한 학생 -1
        for (int l : lost) {
            map.put(l, map.get(l) - 1);
        }

        // 4. 체육복 잃어버린 학생 중 체육복이 없는 학생의 앞뒤 체크
        // 잃어버린 학생 배열을 정렬하는 이유
        // 최대한 효율적으로 체육복을 빌려주기 위해서
        for (int l : lost) {
            if (map.get(l) == 0) {
                int prev = l - 1;
                int next = l + 1;
                if (map.containsKey(prev) && map.get(prev) >= 2) {
                    map.put(prev, map.get(prev) - 1);
                    map.put(l, map.get(l) + 1);
                } else if (map.containsKey(next) && map.get(next) >= 2) {
                    map.put(next, map.get(next) - 1);
                    map.put(l, map.get(l) + 1);
                }
            }
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 1) ans++;
        }

        return ans;
    }
}
