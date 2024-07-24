package baekjoon.silver.silver4.boj25192_인사성밝은곰곰이;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj25192_인사성밝은곰곰이/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int N = Integer.parseInt(br.readLine());

        br.readLine();
        Set<String> set = new HashSet<>();
        for (int i = 1; i < N; i++) {
            String chat = br.readLine();

            if (!"ENTER".equals(chat) && !set.contains(chat)) {
                answer++;
                set.add(chat);
            } else if ("ENTER".equals(chat)) {
                set.clear();
            }
        }
        System.out.println(answer);
    }
}
