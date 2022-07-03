package inflearn.soring_searching.q48_장난꾸러기;

import java.util.Arrays;
import java.util.Scanner;
/*
30
122 123 125 125 128 130 133 137 138 138 140 141 142 143 145 147 149 149 154 154 155 157 161 167 167 167 161 170 173 173

 24 27
*/
public class Main {
    public int[] solution(int n, int[] a) {
        int[] answer = new int[2];
        int[] b = a.clone(); // 깊은 복사
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
               if (answer[0] == 0) answer[0] = i+1;
               else answer[1] = i + 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        for (int x : T.solution(N, arr)) System.out.print(x + " ");
    }
}
