package baekjoon.bronze.bronzeⅠ.Boj9933_민균이의비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            words.add(br.readLine());
        }
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (words.contains(reversed)){
                System.out.println(word.length()+ " "+ word.charAt(word.length()/2));
                break;
            }
        }
    }
}
