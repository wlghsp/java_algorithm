package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1159_농구경기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        int n = Integer.parseInt(br.readLine());

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int index = s.charAt(0) - 'a';
            alpha[index]++;

            if (alpha[index] >=5) {
                if (!list.contains((char)(index+97))) {
                    list.add((char) (index + 97));
                }
            }
        }

        if (list.size() == 0) {
            System.out.println("PREDAJA");
        } else {
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
        }







       /* String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = br.readLine();
        }
        Arrays.sort(names); // 사전순 출력을 위한 정렬

        Set<Character> set = new LinkedHashSet<>(); // 중복허용하지 않음은 동일하나, add한 순서대로 값이 저장됨.

        for (String name : names) {
            char c = name.charAt(0);
            int cnt = 0;
            loop:for (int i = 0; i < n; i++) {
                char d = names[i].charAt(0);
                if (c == d) {
                    cnt++;
                }
                if (cnt == 5){
                    set.add(c);
                    break loop;
                }
            }
        }

        if (set.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            Iterator<Character> iter = set.iterator();
            while (iter.hasNext()) {
                System.out.print(iter.next());
            }
        }*/
    }
}
