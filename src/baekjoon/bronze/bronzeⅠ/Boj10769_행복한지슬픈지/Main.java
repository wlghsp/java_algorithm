package baekjoon.bronze.bronzeⅠ.Boj10769_행복한지슬픈지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sen = br.readLine();
        String happy = ":-)";
        String sad = ":-(";
        int happyCnt = 0;
        int sadCnt = 0;

        // 문자열에서 단어의 갯수 세기 subString, startsWith 조합
        for (int i = 0; i < sen.length(); i++) {
            if (sen.substring(i).startsWith(happy)){
                happyCnt++;
            } else if (sen.substring(i).startsWith(sad)) {
                sadCnt++;
            }
        }

        if (happyCnt == 0 && sadCnt == 0) {
            System.out.println("none");
        } else if (happyCnt == sadCnt) {
            System.out.println("unsure");
        } else if (happyCnt > sadCnt) {
            System.out.println("happy");
        } else if (sadCnt > happyCnt) {
            System.out.println("sad");
        }
    }
}
