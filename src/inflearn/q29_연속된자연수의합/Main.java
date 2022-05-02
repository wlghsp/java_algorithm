package inflearn.q29_연속된자연수의합;

import java.util.Scanner;

public class Main {

    public int solution(int n){
        int answer = 0, lt = 1, sum = 0;

        for (int rt = 1; rt <= (n/2 +1); rt++) {
            sum += rt;

            if (sum == n) answer++;

            while (sum >= n) {
                sum -= lt++;
                if (sum == n) answer++;
            }

        }


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(T.solution(N));

    }
}
