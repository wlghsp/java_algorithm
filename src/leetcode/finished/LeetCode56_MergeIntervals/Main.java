package leetcode.finished.LeetCode56_MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {


    public int[][] merge(int[][] intervals) {
        // 인터벌의 배열에 원소가 하나 이하이면 비교할 필요 없이 그대로 반환
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) { // 시작지점이 다른 배열의 끝나는 지점보다 작을 때
                newInterval[1] = Math.max(newInterval[1], interval[1]); // 서로 끝나는지점 중 가장 큰 값으로
            } else { // 겹치는 경우가 아니면 그대로 넣어준다.
                newInterval = interval; // 인터벌은 다음 인터벌과 비교를 위해 넣어준다.
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args) {
        Main T = new Main();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(T.merge(intervals)));

    }
}
