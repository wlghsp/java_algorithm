package programmers.level1.바탕화면정리;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(new String[]{".#...", "..#..", "...#."});
        int[] result2 = s.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
        int[] result3 = s.solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
        int[] result4 = s.solution(new String[]{"..", "#."});

        assertThat(result1).isEqualTo(new int[]{0, 1, 3, 4});
        assertThat(result2).isEqualTo(new int[]{1, 3, 5, 8});
        assertThat(result3).isEqualTo(new int[]{0, 0, 7, 9});
        assertThat(result4).isEqualTo(new int[]{1, 0, 2, 1});
    }
}