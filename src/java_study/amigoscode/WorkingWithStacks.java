package java_study.amigoscode;

import java.util.Stack;

public class WorkingWithStacks {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
    }
}
