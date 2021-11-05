package codeup.string;



/*
scanf("%s", str);를 사용하면 공백이후의 문자를 입력받지 못한다.
공백이 있는 문자열을 입력받아 출력해보자.

입력
공백이 포함된 문자열이 입력된다. (최대길이 30)

출력
입력받은 문자열을 그대로 출력한다.
 
입력 예시   
black sheep wall

출력 예시
black sheep wall

도움말
scanf("%s",&str); 대신 fgets(str, 31, stdin);을 사용하면 공백도 입력받을 수 있습니다.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1133 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.printf("%s", s);
    }
}
