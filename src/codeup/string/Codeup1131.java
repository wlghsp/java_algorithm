package codeup.string;



/*
입력된 문자를 그대로 출력한다.

입력
문자 하나가 입력된다.

출력
입력받은문자를 그대로 출력된다.

입력 예시   
a

출력 예시
a


*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1131 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        System.out.printf("%c", c);
    }
}
