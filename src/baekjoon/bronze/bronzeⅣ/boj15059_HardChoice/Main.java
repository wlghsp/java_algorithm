package baekjoon.bronze.bronzeⅣ.boj15059_HardChoice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int Ca = Integer.parseInt(st.nextToken());
        int Ba = Integer.parseInt(st.nextToken());
        int Pa = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int Cr = Integer.parseInt(st.nextToken());
        int Br = Integer.parseInt(st.nextToken());
        int Pr = Integer.parseInt(st.nextToken());
        int cnt = 0;
        if (Ca < Cr) cnt += Cr - Ca;
        if (Ba < Br) cnt += Br - Ba;
        if (Pa < Pr) cnt += Pr - Pa;
        System.out.println(cnt);
    }
}
