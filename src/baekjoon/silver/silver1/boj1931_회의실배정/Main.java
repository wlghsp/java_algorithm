package baekjoon.silver.silver1.boj1931_회의실배정;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {

    static int N, cnt;
    static List<Meeting> meetings = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1931_회의실배정/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meetings.add(new Meeting(start, end));
        }

        meetings.sort((o1, o2) -> {
            if (o1.end == o2.end) {
                return o1.start - o2.start;
            }
            return o1.end - o2.end;
        });

        int currentTime = 0;
        for (Meeting meeting : meetings) {
            if (currentTime <= meeting.start) {
                cnt++;
                currentTime = meeting.end;
            }
        }

        System.out.println(cnt);
    }
}
