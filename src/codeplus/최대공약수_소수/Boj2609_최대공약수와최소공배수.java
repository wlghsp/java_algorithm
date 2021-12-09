package codeplus.최대공약수_소수;

import java.io.*;
import java.util.StringTokenizer;

public class Boj2609_최대공약수와최소공배수 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(gcd(a,b) +"\n");
        bw.write((a*b/gcd(a,b)) +"");
        bw.flush();
        bw.close();
        br.close();

    }

    static int gcd(int a, int b) {
       if (b==0){
           return a;
       } else {
           return gcd(b, a % b);
       }
    }

    static int gcd1(int a, int b) {
        while (b !=0) {
            int temp = a %b;
            a = b;
            b = temp;
        }
        return a;
    }

}
