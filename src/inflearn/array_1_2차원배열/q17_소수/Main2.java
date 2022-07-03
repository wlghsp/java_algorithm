package inflearn.array_1_2차원배열.q17_소수;

import java.util.Scanner;

public class Main2 {
    private int solution(int n) {
        int count = 0;
        int[] ch = new int[n + 1];
        for(int i=2; i<=n; i++) {
            if (ch[i]==0) {
                count++;
                for (int j = i; j<= n; j+=i){
                    ch[j] = 1;
                }
            }
        }


        return count;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
