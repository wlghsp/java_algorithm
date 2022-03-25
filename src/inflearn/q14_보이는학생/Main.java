package inflearn.q14_보이는학생;
import java.util.Scanner;

public class Main {

    public void solution(int[] arr) {
        int cnt=1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    cnt++;
                    max = arr[i];
            }
        }
        System.out.println(cnt);
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
