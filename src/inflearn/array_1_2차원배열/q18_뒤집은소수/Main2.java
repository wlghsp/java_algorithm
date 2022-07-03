package inflearn.array_1_2차원배열.q18_뒤집은소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0) {
                int t = tmp%10; // 1의 자리 숫자 구하고
                res = res*10 + t; // 1의 자리 숫자를 새로운 숫자에 넣어준다.
                tmp = tmp/10; // 1의 자리를 제한 새로운 tmp로 위 과정을 반복한다.
            }
            if (isPrime(res)) answer.add(res);

        }
        return answer;
    }

    public boolean isPrime(int num) {
        if (num ==1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
