package codesignal;

/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]

the output should be

solution(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.string picture

    A non-empty array of non-empty equal-length strings.

    Guaranteed constraints:
    1 ≤ picture.length ≤ 100,
    1 ≤ picture[i].length ≤ 100.

    [output] array.string

    The same matrix of characters, framed with a border of asterisks of width 1.



 */

import java.util.Arrays;

public class AddBorder {

    static String[] solution(String[] p) {
        String[] answer = {};
        int len = p[0].length()+2;
        String ast = "";
        for (int i = 0; i < len; i++) {
            ast += "*";
        }

        for (int i = 0; i < p.length; i++) {
            p[i] = "*" + p[i] +"*";
        }
        answer = new String[p.length + 2];

        answer[0] = ast;
        int j = 1;
        for (int i = 0; i < p.length; i++) {
            answer[j++] = p[i];
        }
        answer[answer.length -1] = ast;

        return answer;


    }


    // 베스트 자바 풀이
    static String[] solution1(String[] p) {
        String[] framedPicture = new String[p.length + 2];

        for(int i = 0 ; i < p.length ; i++) {
            framedPicture[i+1] = '*' + p[i] + '*';
        }
        System.out.println(Arrays.toString(framedPicture));

        framedPicture[0] = framedPicture[p.length + 1] = framedPicture[1].replaceAll(".","*"); // 문자열 길이의 모든 문자열을 *로 바꿔서 첫번째와 마지막 인덱스에 집어 넣어 줌

        return framedPicture;
    }


    public static void main(String[] args) {
        String[] a = {"abc",
                "ded"};
        System.out.println(Arrays.toString(solution(a)));
    }
}
