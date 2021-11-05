package codeup.string;



/*
한 단어를 입력받아 출력한다.

입력
한 단어가 입력으로 주어진다.(단어 길이는 8글자 이하)

출력
입력받은 단어를 그대로 출력한다.

입력 예시   
cat

출력 예시
cat

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1132 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.printf("%s", s);
    }
}
