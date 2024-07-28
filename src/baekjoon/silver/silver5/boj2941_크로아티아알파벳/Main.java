package baekjoon.silver.silver5.boj2941_크로아티아알파벳;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj2941_크로아티아알파벳/input.txt"));

        List<String> alphabets = List.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        for (String string : alphabets) {
            word = word.replace(string, "!");
        }

        System.out.println(word.length());
    }
}
