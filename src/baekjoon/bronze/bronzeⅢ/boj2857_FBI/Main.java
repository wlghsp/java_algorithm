package baekjoon.bronze.bronzeⅢ.boj2857_FBI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean found = false;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            String s = br.readLine();
            if (s.contains("FBI")){
                found = true;
                list.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (found) {
            for (Integer i : list) {
                sb.append(i).append(" ");
            }
        }
        else sb.append("HE GOT AWAY!");
        System.out.println(sb);
    }
}
