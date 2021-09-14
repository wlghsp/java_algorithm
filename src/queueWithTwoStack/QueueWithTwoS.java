package queueWithTwoStack;

import java.util.Stack;

public class QueueWithTwoS {
    public static class MyQueue<T> {
        private Stack<T> stackNewestOnTop = new Stack<T>();
        private Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Add item
            stackNewestOnTop.push(value);

        }

        public T peek(T value) { // Get "oldest" item
            // move elements from stackNewest to stackOldest
            shiftStacks();
            return stackOldestOnTop.peek(); // 최근엔 추가된 데이터 조회
        }

        private void shiftStacks() {
            if (stackOldestOnTop.isEmpty()) {
                while (!stackNewestOnTop.isEmpty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }

        public T dequeue() { // Get "oldest" item and remove it
            // move elements from stackNewest to stackOldest
            shiftStacks();
            return stackOldestOnTop.pop(); // 최근엔 추가된 데이터 조회 및 삭제
        }

    }

    public static void main(String[] args) {

    }
}