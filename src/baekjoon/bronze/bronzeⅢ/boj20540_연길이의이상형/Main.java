package baekjoon.bronze.bronzeⅢ.boj20540_연길이의이상형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'E') result += 'I';
            else if (c == 'I') result += 'E';
            else if (c == 'S') result += 'N';
            else if (c == 'N') result += 'S';
            else if (c == 'T') result += 'F';
            else if (c == 'F') result += 'T';
            else if (c == 'J') result += 'P';
            else if (c == 'P') result += 'J';
        }
        System.out.println(result);
    }
}
