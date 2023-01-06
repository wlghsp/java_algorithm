package inflearn.greedy.결혼식;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class Friend implements Comparable<Friend> {

    public int time;
    public char status;

    Friend(int time, char status) {
        this.time = time;
        this.status = status;
    }

    @Override
    public int compareTo(Friend o) {
        if (this.time == o.time) {
            return this.status - o.status;
        }
        return this.time - o.time;
    }
}

public class Main {

    private int solution(List<Friend> list) {
        list.sort(Comparator.naturalOrder());
        int cnt = 0;
        int answer = Integer.MIN_VALUE;
        for (Friend f : list) {
            if (f.status == 'e') cnt--;
            else cnt++;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Friend> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int come = sc.nextInt();
            int go = sc.nextInt();
            list.add(new Friend(come, 's'));
            list.add(new Friend(go, 'e'));
        }
        System.out.println(T.solution(list));
    }
}
