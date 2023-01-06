package inflearn.greedy.최대수입스케쥴;

import java.util.*;

class Lecture implements Comparable<Lecture> {

    public int money, day;

    Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }
}

public class Main {

    static int n, max = Integer.MIN_VALUE;
    private int solution(List<Lecture> list) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 큰 값을 우선순위로 하는 큐
        Collections.sort(list);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for(; j <n; j++) {
                if (list.get(j).day < i) break;
                pq.offer(list.get(j).money);
            }
            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        List<Lecture> list = new ArrayList<>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int day = sc.nextInt();
            list.add(new Lecture(money, day));
            if (day > max) max = day;
        }
        System.out.println(T.solution(list));

    }


}
