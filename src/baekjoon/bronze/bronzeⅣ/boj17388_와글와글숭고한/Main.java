package baekjoon.bronze.bronzeⅣ.boj17388_와글와글숭고한;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

enum Schools {
    Soongsil(1),
    Korea(2),
    Hanyang(3);
    private final int value;
    Schools(int value) {
        this.value = value;
    }
    public static Schools findNameOfSchool(int value) {
        return Arrays.stream(Schools.values())
                .filter(x -> x.value == value)
                .findFirst()
                .get();
    }
    public static String getNameOfSchool(int value) {
        return findNameOfSchool(value).name();
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[3];
        int sum = 0;
        int minVal = Integer.MAX_VALUE;
        String minSchool = "";
        for (int i = 1; i <= 3; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            sum += tmp;
            if (tmp < minVal) {
                minVal = tmp;
                minSchool = Schools.getNameOfSchool(i);
            }
        }
        if (sum  >= 100) System.out.println("OK");
        else {
            System.out.println(minSchool);
        }
    }
}
