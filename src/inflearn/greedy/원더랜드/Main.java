package inflearn.greedy.원더랜드;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Road {
    int start;
    int end;
    int cost;

    public Road(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }
}

public class Main {

    static int V, E;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/inflearn/greedy/원더랜드/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    }
}
