package baekjoon.silver.silver5.boj1543_문서검색;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj1543_문서검색/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();

        int idx = 0;
        int cnt = 0;
        while (idx < doc.length()) {
            int findIdx = doc.indexOf(word, idx);

            if (findIdx == -1) break;
            else {
                cnt++;
                idx = word.length();
                doc = doc.substring(findIdx);
            }
        }

        System.out.println(cnt);

    }
}
