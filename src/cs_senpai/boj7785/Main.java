package cs_senpai.boj7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String el = st.nextToken();
            if (el.equals("enter")) {
                set.add(name);
            } else {
                if (set.contains(name)) {
                    set.remove(name);
                }
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
