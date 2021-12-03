package codesignal;


/*
Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

    For inputString = "(bar)", the output should be
    solution(inputString) = "rab";
    For inputString = "foo(bar)baz", the output should be
    solution(inputString) = "foorabbaz";
    For inputString = "foo(bar)baz(blim)", the output should be
    solution(inputString) = "foorabbazmilb";
    For inputString = "foo(bar(baz))blim", the output should be
    solution(inputString) = "foobazrabblim".
    Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string inputString

    A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses in inputString form a regular bracket sequence.

    Guaranteed constraints:
    0 ≤ inputString.length ≤ 50.

    [output] string

    Return inputString, with all the characters that were in parentheses reversed.



*/

// https://github.com/vinicius3333/CodeFights/blob/master/Intro/Smooth_Sailing/reverseParentheses.java
public class ReverseInParentheses {

    static String solution(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == ')'){
                s = s.substring(0, i) + s.substring(i+1);
                i--;
                String reversed = "";
                while (s.toCharArray()[i] != '(') {
                    reversed += s.toCharArray()[i];
                    s = s.substring(0, i) + s.substring(i + 1);
                    i--;
                }

                s = s.substring(0, i) + reversed + s.substring(i + 1);
                i += reversed.length() - 1;
            }

        }

        return s;

    }


    // 베스트 자바 풀이
    static String solution1(String s) {

      StringBuilder sb = new StringBuilder(s);
      int start, end;
      while (s.indexOf("(") != -1) {
          start = sb.lastIndexOf("("); // 뒤에서 찾은 "(" 의 인덱스
          end = sb.indexOf(")", start); // start인덱스에서부터 찾은 ")"
          sb.replace(start, end+1, new StringBuilder(sb.substring(start+1, end)).reverse().toString());
          // start~end까지의 위치의 문자열을 start+1 에서 end-1까지의 문자열을 reverse한 문자열과 교체
      }

      return sb.toString();

    }
    

    public static void main(String[] args) {
        System.out.println(solution("foo(bar)baz")); // "foorabbaz"
        System.out.println(solution("foo(bar)baz(blim)")); // "foorabbazmilb"
        System.out.println(solution("foo(bar(baz))blim")); // "foobazrabblim"

    }
}
