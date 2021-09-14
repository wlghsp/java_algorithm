package queueWithTwoStack;

import java.io.*;
import java.util.*;
import java.text.*;

public class BalancedParentheses {

    public static char[][] TOKENS = { { '{', '}' }, { '[', ']' }, { '(', ')' } };

    public static boolean isOpenTerm(char c) { // 여는 괄호 확인
        for (char[] array : TOKENS) {
            if (array[0] == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean matches(char openTerm, char closeTerm) { // 닫는 괄호 열린괄호와 확인
        for (char[] array : TOKENS) {
            if (array[0] == openTerm) {
                return array[1] == closeTerm;
            }
        }
        return false;
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : expression.toCharArray()) {
            if (isOpenTerm(c)) { // 여는 괄호인지 확인
                stack.push(c); // 여는 괄호이므로 stack에 저장
            } else { // 닫는 괄호
                if (stack.isEmpty() || !matches(stack.pop(), c)) {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        System.out.println(isBalanced(expression) == true ? '1' : '0');
    }
}

// {(())}
// {()