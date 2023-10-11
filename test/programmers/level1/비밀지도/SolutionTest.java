package programmers.level1.비밀지도;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        Solution s = new Solution();
        String[] result1 = s.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        String[] result2 = s.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
        assertArrayEquals(new String[]{"#####","# # #", "### #", "#  ##", "#####"}, result1);
        assertArrayEquals(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "}, result2);
    }


}