package baekjoon.bronze.bronzeⅣ.boj11365_밀비급일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();
        while (!(s = br.readLine()).equals("END")) {
            String[] s1 = s.split(" ");
            String sentence = "";
            for (int i = s1.length - 1; i >= 0; i--) {
                sentence += new StringBuilder(s1[i]).reverse() + " ";
            }
            sb.append(sentence).append("\n");
        }
        System.out.println(sb);
    }
}
