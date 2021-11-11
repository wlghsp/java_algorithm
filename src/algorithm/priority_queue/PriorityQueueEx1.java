package algorithm.priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueueEx1 {
    public static void main(String[] args) {

        // int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());


        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.offer(3);

        priorityQueue.poll();  // priorityQueue에 첫번째 값을 반환하고 제거 비어있다면 null

        priorityQueue.remove(); // priorityQueue에 첫번째 값 제거

        priorityQueue.clear(); // priorityQueue에 초기화
    }
}
