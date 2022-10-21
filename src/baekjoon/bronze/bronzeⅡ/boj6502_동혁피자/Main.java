package baekjoon.bronze.bronzeⅡ.boj6502_동혁피자;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        int k = 1;
        while (true) {
            double l = sc.nextDouble();
            if (l == 0) break;
            double w = sc.nextDouble();
            double i = sc.nextDouble();

            if (2 * l >= Math.sqrt(Math.pow(w,2) + Math.pow(i,2))) {
                System.out.printf("Pizza %d fits on the table.\n", k++);
            } else {
                System.out.printf("Pizza %d does not fit on the table.\n", k++);
            }
        }
    }
}
