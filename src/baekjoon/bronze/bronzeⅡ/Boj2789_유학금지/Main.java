package baekjoon.bronze.bronzeⅡ.Boj2789_유학금지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> list = new ArrayList<>();
        char[] arr = br.readLine().toCharArray();
        char[] name = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
        for (int i = 0; i < name.length; i++) {
            list.add(name[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
