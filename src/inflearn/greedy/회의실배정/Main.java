package inflearn.greedy.회의실배정;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Meeting implements Comparable<Meeting> {
    public int start, end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.end == o.end) {
            return this.start - o.start;
        }
        return this.end - o.end;
    }
}

public class Main {

    private int solution(List<Meeting> list) {
        list.sort(Comparator.naturalOrder());
        int endTime = Integer.MIN_VALUE;
        int cnt = 0;
        for (Meeting m : list) {
            if (endTime <= m.start) {
                cnt++;
                endTime = m.end;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Meeting(start, end));
        }
        System.out.println(T.solution(list));

    }
}
