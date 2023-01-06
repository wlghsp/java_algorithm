package baekjoon.silverⅠ.boj1931_회의실배정;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Meeting implements Comparable<Meeting> {
    public int start, end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int compareTo(Meeting o) {
        if (this.end == o.end) {
            return this.start - o.start;
        }
        return this.end - o.end;
    }
}
public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new Meeting(s, e));
        }
        list.sort(Comparator.naturalOrder());
        int cnt = 0;
        int endTime = Integer.MIN_VALUE;
        for (Meeting m : list) {
            if (endTime <= m.start) {
                endTime = m.end;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
