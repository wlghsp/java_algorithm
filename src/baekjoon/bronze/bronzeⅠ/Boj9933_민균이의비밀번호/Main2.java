package baekjoon.bronze.bronzeⅠ.Boj9933_민균이의비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }
        for (String s : list) {
            String reversed = new StringBuilder(s).reverse().toString();
            if (list.contains(reversed)) {
                System.out.println(reversed.length() + " " + reversed.charAt(reversed.length()/2));
                break;
            }
        }
    }
}
