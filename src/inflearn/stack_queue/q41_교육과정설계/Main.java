package inflearn.stack_queue.q41_교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public String solution(String order, String plan) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < order.length(); i++) {
            queue.offer(order.charAt(i));
        }

        for (int i = 0; i < plan.length(); i++) {
            char c = plan.charAt(i);
            if (queue.contains(c)) {
                if (queue.peek() == c) {
                    queue.poll();
                }
            }
        }

        return queue.isEmpty() ? "YES": "NO";
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String order = sc.next();
        String plan = sc.next();
        System.out.println(T.solution(order, plan));
    }
}
