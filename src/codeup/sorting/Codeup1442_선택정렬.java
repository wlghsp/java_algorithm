package codeup.sorting;

/*
5
3
2
4
5
1


오름차순 선택 정렬은 '가장 작은 원소를 찾아 첫번째 위치로 옮기고, 남은 원소를 또 탐색하여 그 다음 작은 원소를 찾아 두번째 위치로 옮기고, ... 이런식으로 정렬하는 방식'이다.
 */


import java.io.*;

public class Codeup1442_선택정렬 {

    static int[] a = new int[10001];
    static int n, min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < n; i++) {
            min = i;
            for (int j = i + 1; j <= n; j++) {
                if (a[j] < a[min])
                {
                    min = j; // 최솟값의 인덱스 찾는 과정
                }
            // 최솟값 인덱스와 swap하기
            swap(min, i);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(a[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }

    public static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
