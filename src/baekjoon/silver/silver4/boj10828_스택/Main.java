package baekjoon.silver.silver4.boj10828_스택;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj10828_스택/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int num;
        while (N-- > 0) {
            String[] strArr = br.readLine().split(" ");
            switch (strArr[0]) {
                case "push":
                    list.add(Integer.parseInt(strArr[1]));
                    break;
                case "pop":
                    num = list.isEmpty() ? -1 : list.remove(list.size() - 1);
                    sb.append(num).append('\n');
                    break;
                case "size":
                    sb.append(list.size()).append('\n');
                    break;
                case "empty":
                    sb.append(list.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "top":
                    sb.append(
                            list.isEmpty() ? -1 :
                            list.get(list.size() - 1)).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}
