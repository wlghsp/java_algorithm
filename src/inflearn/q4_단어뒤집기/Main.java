package inflearn.q4_단어뒤집기;

import java.util.Scanner;

public class Main {

    public void solution(String[] arr) {
        for (String s : arr) {
            System.out.println(new StringBuilder(s).reverse());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main T = new Main();
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        T.solution(arr);

    }
}
