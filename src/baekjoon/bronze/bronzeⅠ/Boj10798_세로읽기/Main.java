package baekjoon.bronze.bronzeⅠ.Boj10798_세로읽기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        int[] length = new int[5];
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
            length[i] = arr[i].length();
            if (maxLen < arr[i].length()){
                maxLen = arr[i].length();
            }
        }
        /*
         1. 길이를 따로 저장하고, 길이 중에서 최대길이를 찾는다.
         2. 최대길이를 바깥쪽 포문의 반복 사이즈로 하고 안쪽은 5개 단어이므로 5로 함
         3. i 가 해당 문자의 길이보다 작은 경우에만 문자를 더해줄 수 있게 if문으로 거름
        */
        String answer = "";
        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < length[j]){
                    answer += arr[j].charAt(i);
                }
            }
        }
        System.out.println(answer);
    }
}
