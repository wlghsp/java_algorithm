package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode155_MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
    }

}

//class MinStack1 {
//    int min;
//    Stack<Integer> stack;
//    public MinStack1() {
//        min = Integer.MAX_VALUE;
//        stack = new Stack<>();
//    }
//
//    // 스택에 집어 넣기
//    public void push(int x) {
//        if (x <= min) {
//            stack.push(min); // 그전 최소값을 스택에 집어 넣어 두기
//            min = x;
//        }
//
//        stack.push(x);
//    }
//
//    // 제일 최근에 들어간 값 제거
//    // 스택 제일 위에 있는 값 제거
//    public void pop() {
//        if (stack.pop() == min) { // pop한 값이 최소값이면
//            min = stack.pop(); // 한번 더 pop 을 해서 최소값에 넣어둔다.
//        }
//    }
//
//    // 제일 위에 있는 값 얻기
//    public int top() {
//        return stack.peek();
//    }
//
//
//    // 최소값을 찾아서 전달
//    public int getMin() {
//        return min;
//    }
//}

// 스택 2개 쓰는 방법,
class MinStack {

    private Stack<Integer> valueStack;
    private Stack<Integer> minimumStack;

    public MinStack() {
        valueStack = new Stack<>();
        minimumStack = new Stack<>();
    }

    public void push(int val) {
        if(minimumStack.isEmpty() || val <= getMin()) minimumStack.push(val);
        valueStack.push(val);
    }

    public void pop() {
        if(valueStack.peek() == getMin()) minimumStack.pop();
        valueStack.pop();
    }

    public int top() {
        return valueStack.peek();
    }

    public int getMin() {
        return minimumStack.peek();
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */