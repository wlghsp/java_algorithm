package baekjoon.bronze.bronzeⅢ.boj21964_선린인터넷고등학교교가;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        S = S.substring(S.length() - 5);
        System.out.println(S);
    }
}
