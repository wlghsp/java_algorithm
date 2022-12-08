package baekjoon.bronze.bronzeⅢ.boj16431_베시와데이지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(brr.readLine());
        int br = Integer.parseInt(st.nextToken());
        int bc = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(brr.readLine());
        int dr = Integer.parseInt(st.nextToken());
        int dc = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(brr.readLine());
        int jr = Integer.parseInt(st.nextToken());
        int jc = Integer.parseInt(st.nextToken());

        int bDist = Math.max(Math.abs(br - jr), Math.abs(bc - jc));
        int dDist = Math.abs(dr - jr) + Math.abs(dc - jc);

        if (bDist < dDist) {
            System.out.println("bessie");
        } else if (bDist > dDist){
            System.out.println("daisy");
        } else {
            System.out.println("tie");
        }
    }
}
