package inflearn.array_1_2차원배열.q18_뒤집은소수;

import java.util.Scanner;

public class Main {
    private void solution(int n, String[] s) {

        StringBuilder sb = new StringBuilder();
        for (String x : s) {
            StringBuilder temp = new StringBuilder(x);
            String reversed = temp.reverse().toString();
            int reversedInt = Integer.parseInt(reversed);
            if (isPrimeNumber(reversedInt)) sb.append(reversedInt).append(" ");
        }
        System.out.println(sb);
    }

    public boolean isPrimeNumber(int x) {
        if (x == 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = null;
        s = sc.nextLine().split(" ");
        T.solution(n, s);
    }
}
