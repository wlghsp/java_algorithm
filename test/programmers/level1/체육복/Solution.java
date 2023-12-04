package programmers.level1.체육복;

import java.util.*;

public class Solution {


    // 배열 풀이
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 2];

        for (int i : lost) {
            student[i]--;
        }
        for (int i : reserve) {
            student[i]++;
        }

        for (int i = 1; i < n + 1; i++) {
            if (student[i] == 1) {
                int front = i - 1;
                int back = i + 1;
                if (student[front] == -1) {
                    student[front]++;
                    student[i]--;
                } else if (student[back] == -1) {
                    student[back]++;
                    student[i]--;
                }
            }
        }

        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            if (student[i] >= 0) ans++;
        }
        return ans;
    }

    // Set 풀이
    public int solution2(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();

        for (int i : reserve) {
            resSet.add(i);
        }

        for (int i : lost) {
            if (resSet.contains(i)) {
                resSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }

        for (Integer i : resSet) {
            if (lostSet.contains(i - 1)) {
                lostSet.remove(i - 1);
            } else if (lostSet.contains(i + 1)) {
                lostSet.remove(i + 1);
            }
        }


        return n - lostSet.size();

    }

    // hashMap 풀이
    public int solution1(int n, int[] lost, int[] reserve) {
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
