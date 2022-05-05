package programmers.level1.체육복;

import java.util.HashSet;

public class 체육복_Set {
    public int solution(int n, int[] lost, int[] reserve) {
        // 1. Set을 만든다.
        HashSet<Integer> resSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        for (int i : reserve) {
            resSet.add(i);
        }
        // 여분이 있는 학생이 도둑을 맞았다면 그 친구는 여분이 없는 것과 같아서 제거해준다.
        for (int i : lost) {
            if (resSet.contains(i)) {
                resSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }

        // 2. 여분을 기준으로 앞뒤로 확인하여 체육복을 빌려준다.
        // 진짜 여분이 있는 학생들만 남은 resSet의 전후에 있는 숫자는 체육복을 빌려줄 수 있어 삭제
        for (Integer i : resSet) {
            if (lostSet.contains(i-1)) {
                lostSet.remove(i-1);
            } else if (lostSet.contains(i+1)) {
                lostSet.remove(i+1);
            }
        }
        // 3. 전체 학생 수에서 lostSet에 남은 학생 수를 빼준다.
        // lostSet에는 다른 학생이 빌려줄 수 없는 학생들이 남았다.
        return n - lostSet.size();
    }


    public static void main(String[] args) {
        체육복_Set sol = new 체육복_Set();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(sol.solution(n, lost, reserve));

    }
}
