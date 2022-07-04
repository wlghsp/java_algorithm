package coding_monster.problem2D_문자열의비교;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    @Test
    public void equalsTest1() {
        char[] s1 = "algorithm".toCharArray();
        char[] s2 = "allergy".toCharArray();
        boolean result = StringUtil.equals(s1, s2);
        assertEquals(false, result);
    }

    @Test
    public void equalsTest2() {
        char[] s1 = "algorithm".toCharArray();
        char[] s2 = "algorithm".toCharArray();
        boolean result = StringUtil.equals(s1, s2);
        assertEquals(true, result);
    }

    @Test
    public void equalsTest3() {
        char[] s1 = "allergy".toCharArray();
        char[] s2 = "allergy".toCharArray();
        boolean result = StringUtil.equals(s1, s2);
        assertEquals(true, result);
    }

    @Test
    public void equalsTest4() {
        char[] s1 = "aaaz".toCharArray();
        char[] s2 = "aaa".toCharArray();
        boolean result = StringUtil.equals(s1, s2);
        assertEquals(false, result);
    }

    @Test
    public void equalsLongTest1() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'z');
        Arrays.fill(s2, 'z');

        boolean result = StringUtil.equals(s1, s2);
        assertEquals(true, result);
    }

    @Test
    public void equalsLongTest2() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'a');
        Arrays.fill(s2, 'a');
        s1[s1.length - 1] = 'z';

        boolean result = StringUtil.equals(s1, s2);
        assertEquals(false, result);
    }

    @Test
    public void equalsLongTest3() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'b');
        Arrays.fill(s2, 'b');
        s2[s2.length - 1] = 'z';

        boolean result = StringUtil.equals(s1, s2);
        assertEquals(false, result);
    }

    @Test
    public void compareTest1() {
        char[] s1 = "algorithm".toCharArray();
        char[] s2 = "allergy".toCharArray();
        int result = StringUtil.compare(s1, s2);
        assertTrue(result < 0);
    }

    @Test
    public void compareTest2() {
        char[] s1 = "allergy".toCharArray();
        char[] s2 = "algorithm".toCharArray();
        int result = StringUtil.compare(s1, s2);
        assertTrue(result > 0);
    }

    @Test
    public void compareTest3() {
        char[] s1 = "algorithm".toCharArray();
        char[] s2 = "algorithm".toCharArray();
        int result = StringUtil.compare(s1, s2);
        assertTrue(result == 0);
    }

    @Test
    public void compareTest4() {
        char[] s1 = "zzzzzzzzza".toCharArray();
        char[] s2 = "zzzzzzzzz".toCharArray();
        int result = StringUtil.compare(s1, s2);
        assertTrue(result > 0);
    }

    @Test
    public void compareTest5() {
        char[] s1 = "zzzzzzzzz".toCharArray();
        char[] s2 = "zzzzzzzzza".toCharArray();
        int result = StringUtil.compare(s1, s2);
        assertTrue(result < 0);
    }

    @Test
    public void compareLongTest1() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'b');
        Arrays.fill(s2, 'b');
        int result = StringUtil.compare(s1, s2);
        assertTrue(result == 0);
    }

    @Test
    public void compareLongTest2() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'b');
        Arrays.fill(s2, 'b');
        s2[s2.length - 1] = 'z';
        int result = StringUtil.compare(s1, s2);
        assertTrue(result < 0);
    }

    @Test
    public void compareLongTest3() {
        char[] s1 = new char[100000];
        char[] s2 = new char[100000];
        Arrays.fill(s1, 'b');
        Arrays.fill(s2, 'b');
        s1[s1.length - 1] = 'z';
        int result = StringUtil.compare(s1, s2);
        assertTrue(result > 0);
    }

}