package programmers.level1.데이터분석;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> list = List.of("code", "date", "maximum", "remain");

        int idx = list.indexOf(ext);
        int sortIdx = list.indexOf(sort_by);

        return Arrays.stream(data)
                .filter(d -> d[idx] < val_ext)
                .sorted(Comparator.comparingInt(o -> o[sortIdx]))
                .toArray(int[][]::new);
    }
}
