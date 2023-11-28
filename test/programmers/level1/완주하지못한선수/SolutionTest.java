package programmers.level1.완주하지못한선수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        String result1 = s.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String result2 = s.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"});
        String result3 = s.solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"});

        assertEquals("leo", result1);
        assertEquals("vinko", result2);
        assertEquals("mislav", result3);
    }
}