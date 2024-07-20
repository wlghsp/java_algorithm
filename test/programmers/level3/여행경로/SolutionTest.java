package programmers.level3.여행경로;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String[] result1 = s.solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
        String[] result2 = s.solution(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}});

        assertThat(result1).isEqualTo(new String[]{"ICN", "JFK", "HND", "IAD"});
        assertThat(result2).isEqualTo(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"});
    }
}