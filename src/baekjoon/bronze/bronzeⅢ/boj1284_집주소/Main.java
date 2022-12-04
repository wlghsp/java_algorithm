package baekjoon.bronze.bronzeⅢ.boj1284_집주소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String n = br.readLine();
            if ("0".equals(n)) break;
            int result = 2;
            result += n.length() - 1;
            for (int i = 0; i < n.length(); i++) {
                char c = n.charAt(i);
                if (c == '1') result += 2;
                else if (c == '0') result += 4;
                else result += 3;
            }
            System.out.println(result);
        }

    }
}
