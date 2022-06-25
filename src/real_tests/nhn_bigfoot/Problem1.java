package real_tests.nhn_bigfoot;

import java.util.*;

public class Problem1 {

    /*
    카드섞기
    Cut
    - 카드 뭉치의 아래에 있는 카드 n/2 장을 순서 바꾸지 않고 그대로 카드 뭉치 위에 올림
    Riffle
     - 카드 뭉치의 위에 있는 n / 2장으로 카드뭉치 1을 만들고 카드 뭉치의 아래에 있는 n/2 장으로 카드 뭉치 2를 만든다.
     이때 카드의 순서는 바뀌지 않는다.
     - 카드 뭉치 1의 가장 아래에 위치한 카드를 바닥에 내려놓는다.
     - 카드 뭉치 2의 가장 아래에 위치한 카드를 방금 내려놓은 카드 바로 위에 내려 놓는다.
     - 카드 뭉치 1의 가장 아래에 위치한 카드를 방금 내려 놓은 카드 바로 위에 내려 놓고, 카드 뭉치 2의 가장 아래에 위치한 카드

    카드를 섞은 후의 카드 뭉치 상태
     */

    public int[] solution(int[] cards, String[] shuffles) {
        int[] answer = new int[cards.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for (Integer integer : cards) {
            deque.offer(integer);
        }

        for (String method : shuffles) {
            if (method.equals("Cut")) {
                for (int i = 0; i < cards.length / 2; i++) {
                    deque.offer(deque.pollFirst());
                }
            } else if (method.equals("Riffle")) {
                Deque<Integer> deque1 = new ArrayDeque<>();
                Deque<Integer> deque2 = new ArrayDeque<>();
                for (int i = 0; i < cards.length / 2; i++) {
                    deque1.offer(deque.pollFirst());
                }
                while (!deque.isEmpty()){
                    deque2.offer(deque.pollFirst());
                }
                while (!deque1.isEmpty() && !deque2.isEmpty()) {
                    deque.offerFirst(deque1.pollLast());
                    deque.offerFirst(deque2.pollLast());
                }
            }
        }

        int idx = 0;
        for (Integer integer : deque) {
            answer[idx++] = integer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem1 s = new Problem1();

        System.out.println(Arrays.toString(s.solution(new int[]{1,2,5,6,4,3}, new String[]{"Cut", "Cut", "Cut"}))); // 6, 4, 3, 1, 2, 5
        System.out.println(Arrays.toString(s.solution(new int[]{5,2,4,6,1,3}, new String[]{"Riffle", "Riffle", "Riffle"}))); // 5, 2, 4, 6, 1, 3
        System.out.println(Arrays.toString(s.solution(new int[]{2,3,6,5,4,1}, new String[]{"Cut", "Riffle", "Cut"}))); // 4, 6, 1, 2, 5, 3

    }
}
