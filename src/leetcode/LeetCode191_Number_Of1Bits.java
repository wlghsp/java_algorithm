package leetcode;

public class LeetCode191_Number_Of1Bits {

    /*
    숫자 n을 이진수로 변환했을 때 1비트의 갯수를 구하는 문제

    시프트 연산을 진행하면서 풀면 된다.
    주의할 점은 음수도 주어질 수 있기 때문에 >>> 연산을 사용한다.
     */

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n & 1);
            n >>>= 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        LeetCode191_Number_Of1Bits T = new LeetCode191_Number_Of1Bits();


        System.out.println(T.hammingWeight(00000000000000000000000000001011));
    }
}
