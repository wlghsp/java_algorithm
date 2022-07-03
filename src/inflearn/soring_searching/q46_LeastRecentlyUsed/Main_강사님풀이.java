package inflearn.soring_searching.q46_LeastRecentlyUsed;

import java.util.Scanner;

public class Main_강사님풀이 {

    public static int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            // 인덱스 찾기
            for (int i =0; i <size; i++) if (x == cache[i]) pos = i;
            if (pos == -1) {
                // 맨 뒤에서부터 앞으로 하나씩 당기기
                for (int i = size -1; i >= 1; i--) cache[i] = cache[i-1];
            } else {
                // 작업의 숫자 하나 뒤에서부터 앞으로 하나씩 당기기
                for (int i = pos; i >= 1; i--) cache[i] = cache[i-1];
            }
            // 둘 다 맨 앞에 작업을 집어 넣어 주고 있어 밖으로 빼 줌
            cache[0] = x;
        }
        return cache;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : solution(s, n, arr)) System.out.print(x + " ");
    }
}
