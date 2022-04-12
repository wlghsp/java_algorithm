package leetcode;

public class Leetcode326_PowerOfThree {


    /*
     3의 제곱수 판단 true 아니면 false
     1. 3으로 나눌 수 있으면 계속 3으로 나누고 3으로 나눈 수를 할당한다.
     2. 3의 제곱수라면 마지막에 n이 3이므로 n은 1로 반복문이 종료된다. 따라서 return 에서 n==1일지 확인한다.
     3. n 이 0이라면 false를 반환한다.
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
