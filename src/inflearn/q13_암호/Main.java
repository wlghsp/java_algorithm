package inflearn.q13_암호;
import java.util.Scanner;

public class Main {

    public void solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ");
        for (int i = 0; i < arr.length- 1; i++) {
            if (arr[i] < arr[i+1]) {
                sb.append(arr[i+1]).append(" ");
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int num;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr[i] = num;
        }
        T.solution(arr);
    }
}
