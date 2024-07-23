package baekjoon.silver.silver5.boj1251_단어나누기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj1251_단어나누기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        List<String> list = new ArrayList<>();
        for (int i = 1; i < word.length() - 1; i++) {
            for (int j = i + 1; j < word.length(); j++) {
                StringBuilder strSb1 = new StringBuilder(word.substring(0, i));
                StringBuilder strSb2 = new StringBuilder(word.substring(i, j));
                StringBuilder strSb3 = new StringBuilder(word.substring(j));
                String str1 = strSb1.reverse().toString();
                String str2 = strSb2.reverse().toString();
                String str3 = strSb3.reverse().toString();
                list.add(str1 + str2 + str3);
            }
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(0));
    }

}
