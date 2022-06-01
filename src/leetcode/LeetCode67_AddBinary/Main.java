package leetcode.LeetCode67_AddBinary;

import java.math.BigInteger;

public class Main {


    public String addBinary1(String a, String b) {
        BigInteger bigA = new BigInteger(a, 2);
        BigInteger bigB = new BigInteger(b, 2);
        BigInteger sum = bigA.add(bigB);
        return sum.toString(2);
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0){
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            carry = sum > 1 ? 1 : 0;
            sb.append(sum % 2);
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();

    }


    public static void main(String[] args) {
        String a = "11", b = "1";
        Main T = new Main();
        System.out.println(T.addBinary(a, b));
    }
}
