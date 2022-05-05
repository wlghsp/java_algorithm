package leetcode.finished;

import java.util.Arrays;

public class Leetcode63_plusone {

    public int[] plusOne(int[] digits) {
        int carry =1 ;
        int index = digits.length -1;
        while (index >= 0 && carry > 0) {
            digits[index] = (digits[index] + 1) % 10;
            carry = (digits[index] == 0) ? 1: 0;
            index--;
        }
        if (carry > 0) {
            digits = new int[digits.length +1];
            digits[0] = 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        Leetcode63_plusone T = new Leetcode63_plusone();
        int[] digits = {1,2,3};
        int[] ex2 = {4,3,2,1};
        int[] ex3 = {9, 9, 9};
        System.out.println(Arrays.toString(T.plusOne(digits)));
        System.out.println(Arrays.toString(T.plusOne(ex2)));
        System.out.println(Arrays.toString(T.plusOne(ex3)));
    }
}

/*

1. 주어진 숫자 배열의 맨뒤(=1의 자리수)에 1을 더하고, 그 수의 1의 자릿수만 저장한다.
(9+1= 10이 되었을 때, 1의 자리수에 0만 저장하기 위함
2. 저장한 수가 0인 경우 한자리 올림수(carry)가 발생한 것이므로 carry를 1로 설정하고
다음 자릿수로 넘어가 1번 내용을 반복한다.
3. 저장한 수가 0이 아닌 경우 carry는 0이므로 반복문을 멈춘다.
4. 끝까지 다 돌았을 때 carry가 1이면, 주어진 수보다 한자리 수가 더 큰수가 된다는 뜻이므로,
해당 크기의 새로운 숫자 배열을 생성하고, 첫번째 인덱스만 1로 설정한다.
 시간 복잡도:
 주어진 숫자배열 길이에 따라 while문 반복하므로 O(n)

 공간복잡도:
 최악의 경우에 주어진 배열의 +1 크기의 배열을 생성하므로 O(n)
 그외의 경우에는 주어진 배열을 사용하므로 O(1)
 */
