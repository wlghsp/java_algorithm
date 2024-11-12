package baekjoon.bronze.bronze1.boj30034_SliceString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        List<String> answer = new ArrayList<>();
        Set<String> set = new HashSet<>(Arrays.asList(strArr));
        set.add(" ");

        int M = Integer.parseInt(br.readLine());
        String[] numArr = br.readLine().split(" ");
        set.addAll(Arrays.asList(numArr));

        int K = Integer.parseInt(br.readLine());
        String[] comArr = br.readLine().split(" ");
        for (String s : comArr) {
            set.remove(s);
        }

        int s = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s; i++) {
            String c = Character.toString(str.charAt(i));
            if (!set.contains(c)) {
                sb.append(c);
            } else {
                if (isSbNotEmpty(sb)) {
                    answer.add(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }
        if (isSbNotEmpty(sb)) {
            answer.add(sb.toString());
        }


        for (String string : answer) {
            System.out.println(string);
        }

    }

    private static boolean isSbNotEmpty(StringBuilder sb) {
        return sb.length() > 0;
    }
}
