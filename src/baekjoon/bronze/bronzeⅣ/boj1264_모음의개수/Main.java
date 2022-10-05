package baekjoon.bronze.bronzeⅣ.boj1264_모음의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[] c = {'a', 'e', 'i', 'o', 'u'};
        ArrayList<Character> list = new ArrayList<>(Arrays.asList(c));
        while (true) {
            String str = br.readLine().toLowerCase();
            if (str.equals("#")) break;
            int cnt = 0;
            for (char c1 : str.toCharArray()) {
                if (list.contains(c1)) cnt++;
            }
            System.out.println(cnt);
        }

    }
}
