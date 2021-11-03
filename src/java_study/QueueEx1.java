package java_study;

import java.util.LinkedList;
import java.util.Queue;

/*
Queue란?
Queue의 사전적 의미는 무엇을 기다리는 사람, 차량 등의 줄 혹은 줄을 서서 기다리는 것을 의미하는데 이처럼 
줄을 지어 순서대로 처리되는 것이 큐라는 자료구조입니다. 큐는 데이터를 일시적으로 쌓아두기 위한 자료구조로
스택과는 다르게 FIFO(First In First Out)의 형태를 가집니다. FIFO 형태는 뜻 그대로 먼저 들어온 데이터가
가장 먼저 나가는 구조를 말합니다. 
Enqueue : 큐 맨 뒤에 데이터 추가
Dequeue : 큐 맨 앞쪽의 데이터 삭제

Queue의 특징
1. 먼저 들어온 자료가 먼저 나오는 구조. FIFO 구조
2. 큐는 한 쪽 끝은 프런트(front)로 정하여 삭제 연산만 수행함
3. 다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행함
4. 그래프의 넓이 우선 탐색(BFS)에서 사용
5. 컴퓨터 버퍼에서 주로 사용, 마구 입력이 되었으나 처리를 하지 못할 때, 버퍼(큐)를 만들어 대기 시킴

*/

public class QueueEx1 {
    public static void main(String[] args) {
        // Queue 선언
        Queue<Integer> queue = new LinkedList<>(); // int형 queue 선언, linkedlist 이용
        Queue<String> queue2 = new LinkedList<>(); // String형 queue 선언, linkedlist 이용

        /*
         * 자바에서 큐는 LinkedList를 활용하여 생성해야 합니다. 그렇기에 Queue와 LinkedList가 다 import되어 있어 야
         * 사용이 가능합니다. Queue<Element> queue = new LinkedList<>()와 같이 선언해주면 된다.
         */

        // Queue 값 추가
        queue.add(1); // queue에 값 1 추가
        queue.add(2); // queue에 값 2 추가
        queue.offer(3); // queue에 값 3 추가
        // int a = queue.poll(); // queue에 첫번째 값을 반환하고 제거, 비어 있다면 null
        // queue.remove(); // queue에 첫번째 값 제거
        // queue.clear(); // queue 초기화
        System.out.println(queue);

    }
}
