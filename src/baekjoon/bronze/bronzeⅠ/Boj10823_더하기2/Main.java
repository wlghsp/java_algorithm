package baekjoon.bronze.bronzeⅠ.Boj10823_더하기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String s = null;
        while ((s = br.readLine()) != null){
            if (s.equals("")) break;
            list.add(s);
        }

        String result = "";

        for (String t : list) {
            result += t;
        }

        String[] arr = result.split(",");

        int sum = 0;
        for (String k : arr) {
            sum += Integer.parseInt(k);
        }

        System.out.println(sum);

    }
}
