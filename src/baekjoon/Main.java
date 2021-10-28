package baekjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int number = 666;
        int cnt = 0;
        while (true) {
            if (String.valueOf(number).contains("666")) {
                cnt +=1;
                if (cnt == N) {
                    System.out.println(number);
                    break;
                }
            }
            number +=1;
        }

    }
}
