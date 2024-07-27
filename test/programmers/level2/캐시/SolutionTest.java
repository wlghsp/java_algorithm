package programmers.level2.캐시;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int result1 = s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
        int result2 = s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});
        int result3 = s.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        int result4 = s.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        int result5 = s.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});
        int result6 = s.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"});

        assertThat(result1).isEqualTo(50);
        assertThat(result2).isEqualTo(21);
        assertThat(result3).isEqualTo(60);
        assertThat(result4).isEqualTo(52);
        assertThat(result5).isEqualTo(16);
        assertThat(result6).isEqualTo(25);
    }
}