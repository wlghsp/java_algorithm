package baekjoon.bronze.bronzeⅠ.boj1296_팀이름정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String yeondu = br.readLine();
        int N = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        String highTeam = "";

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            String tmp = arr[i];
            int L = (int) countChar(yeondu.concat(tmp), 'L');
            int O = (int) countChar(yeondu.concat(tmp), 'O');
            int V = (int) countChar(yeondu.concat(tmp), 'V');
            int E = (int) countChar(yeondu.concat(tmp), 'E');

            int score = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
            if (score > max) {
                max = score;
                highTeam = tmp;
            }
        }

        System.out.println(highTeam);
    }



    // Stream을 이용한 방법
    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

    // replace() 를 이용한 특정문자 갯수 세기
    public static int countChar1(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    // 반복문 이용하기
    public static int countChar2(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }


}
