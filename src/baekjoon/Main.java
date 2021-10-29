package baekjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
        int n = Integer.parseInt(br.readLine());
        int original = n; 
        int cnt = 0;
        while (true) {
            n = (n%10)*10 + (((n/10)+(n%10))%10);
            cnt++;
            if (original == n) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
