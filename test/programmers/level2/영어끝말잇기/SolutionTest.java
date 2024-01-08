package programmers.level2.영어끝말잇기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution s = new Solution();
        int[] result1 = s.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        int[] result2 = s.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        int[] result3 = s.solution(2, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        assertArrayEquals(new int[]{3, 3}, result1);
        assertArrayEquals(new int[]{0, 0}, result2);
        assertArrayEquals(new int[]{1, 3}, result3);
    }
}