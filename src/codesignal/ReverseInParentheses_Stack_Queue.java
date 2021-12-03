package codesignal;

import java.lang.Thread.State;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

// https://medium.com/@speedforcerun/leetcode-medium-190-reverse-substrings-between-each-pair-of-parentheses-bb26bb16d680
public class ReverseInParentheses_Stack_Queue {

    static String solution(String s) {



        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            
            if (c == ')') {
                Queue<Character> queue = new LinkedList<>();
                
                while (!stack.isEmpty() && stack.peek() != '(') {
                    queue.add(stack.pop()); // '(' 만나기 전까지 문자들이 reverse되서 queue에 들어감.
                }

                if (!stack.isEmpty()) {
                    stack.pop(); // '(' 를 빼낸다.
                }

                while (!queue.isEmpty()) {
                    stack.push(queue.remove()); // queue에 reverse되서 들어간 문자들을 다시 stack에 집어 넣는다.
                }


            } else {
                stack.push(c); // ')'를 만나기 전까지는 전부 스택에 집어넣는다.
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        

        return sb.reverse().toString();

    }
    

    public static void main(String[] args) {
        System.out.println(solution("foo(bar)baz")); // "foorabbaz"
        System.out.println(solution("foo(bar)baz(blim)")); // "foorabbazmilb"
        System.out.println(solution("foo(bar(baz))blim")); // "foobazrabblim"

    }
}
