package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode202_HappyNumber {

    /*
    1. 중복되지 않는 정수를 담을 Set 타입의 변수를 선언한다.
    2. 반복문을 수행하며, n의 값을 Set에 add하고, 각 자릿수 별 제곱합을 구한다.
    3. 이 과정을 반복적으로 수행하며, n이 1이 될 경우, 반복문을 중단한다. (happy number)
    4. 또는, 이미 이전에 제곱합 처리가 되어 n이 Set에 존재할 경우, 반복문을 중단한다. (infinite circle)
     */

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);

            int temp = n;
            n = 0;

            while(temp != 0) {
                n += (temp % 10) * (temp % 10);
                temp /= 10;
            }

            if (n == 1) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Leetcode202_HappyNumber T = new Leetcode202_HappyNumber();

        int n1 = 19;
        int n2 = 2;

        System.out.println(T.isHappy(n1)); // true
        System.out.println(T.isHappy(n2)); // false

    }
}
