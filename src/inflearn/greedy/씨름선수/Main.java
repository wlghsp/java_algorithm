package inflearn.greedy.씨름선수;

import java.util.*;


class Body implements Comparable<Body> {
    public int height, weight;

    Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height;
    }
}

public class Main {

    private int solution(List<Body> list) {
        list.sort(Comparator.naturalOrder());
        int maxWeight = Integer.MIN_VALUE;
        int cnt = 0;
        for (Body body : list) {
            int weight = body.weight;
            if (maxWeight < weight) {
                cnt++;
                maxWeight = weight;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        List<Body> list = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Body(height, weight));
        }
        System.out.println(T.solution(list));
    }
}
