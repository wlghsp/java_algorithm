package inflearn.two_pointers_sliding_window.q29_연속된자연수의합;

import java.util.Scanner;

public class Main3 {

    // 수학으로 풀기
    public int solution(int n){
        int answer = 0, cnt = 1;

        n--; // 15면 14됨

        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }



        return answer;
    }


    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(T.solution(N));

    }
}
