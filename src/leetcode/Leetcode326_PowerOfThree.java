package leetcode;

public class Leetcode326_PowerOfThree {


    /*
     3의 제곱수 판단 true 아니면 false
     */
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }



    public static void main(String[] args) {
        Leetcode326_PowerOfThree T = new Leetcode326_PowerOfThree();
        int n1 = 27;
        int n2 = 0;
        int n3 = 9;
        System.out.println(T.isPowerOfThree(n1)); // true
        System.out.println(T.isPowerOfThree(n2)); // false
        System.out.println(T.isPowerOfThree(n3)); // true



    }
}
