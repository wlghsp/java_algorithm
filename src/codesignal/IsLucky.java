package codesignal;

import java.util.stream.Stream;

/*
Ticket numbers usually consist of an even number of digits. // 짝수로 구성됨. 

A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
// 절반 숫자의 합이 나머지 절반의 합과 같다면 

Given a ticket number n, determine if it's lucky or not.

Example

    For n = 1230, the output should be
    solution(n) = true;
    For n = 239017, the output should be
    solution(n) = false.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] integer n

    A ticket number represented as a positive integer with an even number of digits.

    Guaranteed constraints:
    10 ≤ n < 106.

    [output] boolean

    true if n is a lucky ticket number, false otherwise.


*/

public class IsLucky {
    
    

    static boolean solution(int n) {

        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        
        int firstHalf = 0, secondHalf= 0;
        
        for (int i = 0; i < digits.length/2; i++) {
            firstHalf += digits[i];
        }
        
        for (int i = digits.length/2; i < digits.length; i++) {
            secondHalf += digits[i];
        }

        return firstHalf == secondHalf ? true : false;

    }
    
    
    public static void main(String[] args) {
        System.out.println(solution(1230));
        System.out.println(solution(239017));
    }
}
