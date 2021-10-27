package baekjoon;

import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write((((int)Math.pow(2, n))-1) + "\n");
        hanoi(n,1,2,3);
        bw.write(sb + "\n");
        bw.flush();
        bw.close();

    }

    static void hanoi(int n, int from, int aux, int to) {
        if (n == 1) {
            sb.append(from + " " + to).append("\n");
            return;           
        }
        hanoi(n-1, from, to, aux);
        sb.append(from + " " + to).append("\n");
        hanoi(n-1, aux, from, to);
    }
}
