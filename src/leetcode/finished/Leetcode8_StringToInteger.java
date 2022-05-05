package leetcode.finished;

public class Leetcode8_StringToInteger {

    public int myAtoi(String s) {

        // trim white spaces
        s = s.trim();
        if (s == null || s.length() < 1) return 0;

        char flag = '+';

        // check negative or positive
        int i = 0;
        if (s.charAt(0) == '-') {
            flag = '-';
            i++;
        }  else if (s.charAt(0) == '+') {
            i++;
        }

        // use double to store result
        double result = 0;

        // calculate value
        while (s.length() > i && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }

        if (flag == '-') result = -result;

        // handle max and min
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }

    public static void main(String[] args) {
        Leetcode8_StringToInteger T = new Leetcode8_StringToInteger();
        System.out.println(T.myAtoi("   -42")); // -42
    }
}
