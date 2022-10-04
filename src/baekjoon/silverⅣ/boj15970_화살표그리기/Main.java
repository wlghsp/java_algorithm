package baekjoon.silverⅣ.boj15970_화살표그리기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    public int loc;
    public int color;

    Point(int color, int loc) {
        this.color = color;
        this.loc = loc;
    }

    public int compareTo(Point o) {
        if (this.color == o.color) return this.loc - o.loc;
        else return this.color - o.color;
    }

}

public class Main {
    static ArrayList<Point> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int loc = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            list.add(new Point(col, loc));
        }
        Collections.sort(list);
        int answer = 0;
        answer += list.get(1).color == list.get(0).color ? list.get(1).loc - list.get(0).loc : 0;
        answer += list.get(list.size() - 1).color == list.get(list.size() - 2).color ? list.get(list.size()-1).loc - list.get(list.size() - 2).loc : 0;

        for (int i = 1; i < list.size() - 1; i++) {
            int minVal1 = Integer.MAX_VALUE;
            int minVal2 = Integer.MAX_VALUE;
            boolean flag = false;
            if (list.get(i).color == list.get(i-1).color){
                minVal1 = Math.abs(list.get(i).loc - list.get(i - 1).loc);
                flag = true;
            }

            if (list.get(i).color == list.get(i+1).color){
                minVal2 = Math.abs(list.get(i).loc - list.get(i + 1).loc);
                flag = true;
            }

            if (flag) {
                answer += Math.min(minVal1, minVal2);
            }
        }
        System.out.println(answer);
    }


}
