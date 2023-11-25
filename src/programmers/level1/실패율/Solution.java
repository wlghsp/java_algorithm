package programmers.level1.실패율;


import java.util.*;

public class Solution {

    public int[] solution(int N, int[] stages) {
        List<Stage> list = new ArrayList<>();
        int[] nStagePlayers = new int[N + 2]; // N + 1 이하의 자연수
        for (int stage : stages) {
            nStagePlayers[stage]++;
        }
        int remainP = stages.length;
        for (int i = 1; i <= N; i++) {
            double fail = (double) nStagePlayers[i] / remainP;
            remainP -= nStagePlayers[i];

            list.add(new Stage(fail, i));
        }
        Collections.sort(list);
        return list.stream().mapToInt(i -> i.stageNum).toArray();
    }

    /**
     *  시간복잡도 N^2
     */
    public int[] solution1(int N, int[] stages) {
        List<Stage> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            final int stage = i;
            long notClearCnt = Arrays.stream(stages)
                    .filter(k -> stage == k)
                    .count();
            long arrived = Arrays.stream(stages)
                    .filter(k -> stage <= k)
                    .count();

            list.add(new Stage((double) notClearCnt / arrived, stage));
        }
        Collections.sort(list);
        return list.stream().mapToInt(i -> i.stageNum).toArray();
    }

}

class Stage implements Comparable<Stage> {
    public double fail;
    public int stageNum;

    public Stage(double fail, int stageNum) {
        this.fail = fail;
        this.stageNum = stageNum;
    }

    @Override
    public int compareTo(Stage o) {
        if (o.fail > this.fail) {
            return 1;
        } else if (o.fail < this.fail) {
            return -1;
        }
        return Integer.compare(this.stageNum, o.stageNum);
    }

}