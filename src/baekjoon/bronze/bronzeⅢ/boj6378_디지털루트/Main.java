package baekjoon.bronze.bronzeⅢ.boj6378_디지털루트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String n = br.readLine();
            if (n.equals("0")) break;
            while (n.length() >= 2) {
                long sum = 0;
                while (n.length() >= 1) {
                    sum += n.charAt(n.length() - 1) - 48;
                    n = n.substring(0, n.length()-1);
                }
                n = String.valueOf(sum);
            }
            System.out.println(n);
        }
    }
}
