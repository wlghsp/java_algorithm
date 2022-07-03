package inflearn.stack_queue.q41_교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_강사님풀이 {

    public String solution(String order, String plan) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char x : order.toCharArray()) queue.offer(x);
        for (char x : plan.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) return "NO";
            }
        }
        if (!queue.isEmpty()) return "NO";

        return answer;
    }


    public static void main(String[] args) {
        Main_강사님풀이 T = new Main_강사님풀이();
        Scanner sc = new Scanner(System.in);
        String order = sc.next();
        String plan = sc.next();
        System.out.println(T.solution(order, plan));
    }
}
