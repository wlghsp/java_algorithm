package baekjoon.bronze.bronzeⅢ.boj3009_네번째점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> xList = new ArrayList<>();
        ArrayList<Integer> yList = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (!xList.contains(x)) xList.add(x);
            else xList.remove(Integer.valueOf(x));

            if (!yList.contains(y)) yList.add(y);
            else yList.remove(Integer.valueOf(y));
        }
        System.out.println(xList.get(0) + " " + yList.get(0));
    }
}
