package baekjoon.silver.silver5.boj11723_집합;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static Set<Integer> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj11723_집합/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();


            int number;
            switch (command) {
                case "add":
                    number = Integer.parseInt(st.nextToken());
                    addNumber(number);
                    break;
                case "remove":
                    number = Integer.parseInt(st.nextToken());
                    removeNumber(number);
                    break;
                case "check":
                    number = Integer.parseInt(st.nextToken());
                    checkNumber(number);
                    break;
                case "toggle":
                    number = Integer.parseInt(st.nextToken());
                    toggleNumber(number);
                    break;
                case "all":
                    allSet();
                    break;
                case "empty":
                    emptySet();
                    break;
            }
        }

        System.out.println(sb);
    }

    private static void emptySet() {
        set.clear();
    }

    private static void allSet() {
        set.clear();
        for (int i = 1; i < 21; i++) {
            set.add(i);
        }
    }

    private static void toggleNumber(int number) {
        if (set.contains(number)) {
            set.remove(number);
        } else {
            set.add(number);
        }
    }

    private static void checkNumber(int number) {
        sb.append(set.contains(number) ? "1" : "0").append(System.lineSeparator());
    }

    private static void removeNumber(int number) {
        set.remove(number);
    }

    private static void addNumber(int number) {
        set.add(number);
    }
}
