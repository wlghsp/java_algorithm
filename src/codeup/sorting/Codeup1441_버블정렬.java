package codeup.sorting;

/*
5
1
3
2
5
4


버블 정렬은 '인접한 두 원소를 검사하여 자리를 바꿔가며 정렬하는 방식'이다.
 */


import java.io.*;

public class Codeup1441_버블정렬 {

    static int[] a = new int[10001];
    static int n, temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
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
}
