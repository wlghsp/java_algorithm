package programmers.level2.과제진행하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String[] result1 = s.solution(new String[][]{{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}});
        String[] result2 = s.solution(new String[][]{{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}});
        String[] result3 = s.solution(new String[][]{{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}});

        assertThat(result1).isEqualTo(new String[]{"korean", "english", "math"});
        assertThat(result2).isEqualTo(new String[]{"science", "history", "computer", "music"});
        assertThat(result3).isEqualTo(new String[]{"bbb", "ccc", "aaa"});
    }
}