package codesignal;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given two strings, find the number of common characters between them.

Example
For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.
Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string s1

    A string consisting of lowercase English letters.

    Guaranteed constraints:
    1 ≤ s1.length < 15.

    [input] string s2

    A string consisting of lowercase English letters.

    Guaranteed constraints:
    1 ≤ s2.length < 15.

    [output] integer


*/

public class CommonCharacterCount {
    static int solution(String s1, String s2) {
        int answer = 0;

        String[] s1Arr = s1.split("");
        String[] s2Arr = s2.split("");

        
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s2Arr));

        for (int i = 0; i < s1Arr.length; i++) {
            if (list.contains(s1Arr[i])) {
                list.remove(s1Arr[i]);
                answer++;
            }
        }

        return answer;
    }
    
    
    
    public static void main(String[] args) {
       System.out.println(solution("aabcc", "adcaa"));
    }
}
