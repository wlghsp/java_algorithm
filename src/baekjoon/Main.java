package baekjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int shortLen = solve(word);
        
        System.out.println(shortLen);
    }

    public static int solve(String word) {
        // 입력 받은 문자열이 이미 팰린드롬일 때 
        if (word.equals(new StringBuilder(word).reverse().toString())) {
            return word.length();
        }

        for (int i = 1; i < word.length(); i++) {
            StringBuilder sb = new StringBuilder(word);

            // 앞에서부터 길이 1씩 늘려가면서 뒤에 붙인다.
            sb.append(new StringBuilder(word.substring(0, i)).reverse());

            // 팰린드롬 체크
            if(sb.toString().equals(sb.reverse().toString())) {
                return sb.length();
            }
        }
        return -1;
    }
}
