package codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.string inputArray

    A non-empty array.

    Guaranteed constraints:
    1 ≤ inputArray.length ≤ 10,
    1 ≤ inputArray[i].length ≤ 10.

    [output] array.string

    Array of the longest strings, stored in the same order as in the inputArray.



*/


public class All_Longest_Strings {


    static String[] solution(String[] arr) {
        String[] answer = {};
        int maxLen = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int temLen = arr[i].length();
            maxLen = Math.max(maxLen, temLen);
        }

        System.out.println(maxLen);
        final int longest = maxLen;

        // ArrayList<String> list = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i].length() == maxLen) {
        //         list.add(arr[i]);
        //     }
        // }

        // // List를 배열로 변환
        // answer = list.toArray(new String[list.size()]);

        return Stream.of(arr).filter(s -> s.length() == longest).toArray(String[]:: new);

    }
    


    public static void main(String[] args) {
        String[] arr= {"aba", "aa", "ad", "vcd", "aba"};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
