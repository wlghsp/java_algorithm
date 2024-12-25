package baekjoon.silver.silver5.boj1316_그룹단어체커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            Set<Character> set = new HashSet<>();
            boolean isGroupWord = true;
            for (int j = 1; j < word.length(); j++) {
                char prev = word.charAt(j - 1);
                char cur = word.charAt(j);
                if (cur != prev) {
                    if (set.contains(cur)) {
                        isGroupWord = false;
                        break;
                    }
                    set.add(prev);
                }
            }
            if (isGroupWord) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
