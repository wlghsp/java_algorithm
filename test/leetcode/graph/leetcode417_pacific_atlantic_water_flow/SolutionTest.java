package leetcode.graph.leetcode417_pacific_atlantic_water_flow;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        // Test Case 1
        List<List<Integer>> result1 = s.pacificAtlantic(new int[][]{
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        });
        // 예상되는 결과
        // [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
        List<List<Integer>> expected1 = List.of(
                List.of(0, 4),
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 2),
                List.of(3, 0),
                List.of(3, 1),
                List.of(4, 0)
        );
        // 결과 비교
        assertEquals(expected1, result1);

        // Test Case 2
        List<List<Integer>> result2 = s.pacificAtlantic(new int[][]{{1}});
        List<List<Integer>> expected2 = List.of(
                List.of(0, 0)
        );
        assertEquals(expected2, result2);

    }
}