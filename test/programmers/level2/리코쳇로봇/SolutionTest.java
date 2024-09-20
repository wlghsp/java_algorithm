package programmers.level2.리코쳇로봇;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        int result1 = solution.solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."});
        int result2 = solution.solution(new String[]{".D.R", "....", ".G..", "...D"});

        assertThat(result1).isEqualTo(7);
        assertThat(result2).isEqualTo(-1);
    }
}