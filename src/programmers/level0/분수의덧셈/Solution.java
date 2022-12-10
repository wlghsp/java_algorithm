package programmers.level0.분수의덧셈;

import java.util.Arrays;

public class Solution {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        denum1 *= num2;
        denum2 *= num1;
        int nomi = denum1 + denum2;
        int deno = num1 * num2;
        // 기약분수를 만들기 위해서는 최대공약수를 구해서 분자, 분모를 나눠준다.
        int gcd = getGCD(nomi, deno);
        return new int[]{nomi / gcd, deno / gcd};
    }

    // 최대공약수 재귀로 구하기, 유클리드 호제법
    private int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }

    // 최대공배수 구하기
    // 두 수의 곱을 최대공약수로 나누어주면 최대공배수
    private int getLCM(int a, int b){
        return a * b / getGCD(a, b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(1, 2, 3, 4)));  // [5,4]
        System.out.println(Arrays.toString(s.solution(9, 2, 1, 3)));  // [29,6]
    }
}
