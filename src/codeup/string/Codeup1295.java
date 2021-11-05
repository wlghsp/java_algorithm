package codeup.string;


/*
주어지는 문장의 대문자를 소문자로, 소문자를 대문자로 변경하는 프로그램을 작성하라.

입력
한 줄의 공백없는 문장이 입력된다.(최대 길이:1000)

출력
대소문자를 서로 변환한 결과를 출력한다.

입력 예시   
CodeChallenge2014withMSP

출력 예시
cODEcHALLENGE2014WITHmsp

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1295 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // int tmp;
        char tmp;
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            // tmp = (int)str.charAt(i);
            tmp = str.charAt(i);
            if ((tmp >= 65)&& (tmp<= 90)) { // 65~ 90까지 
                // output += (char)(tmp + 32);  // 대문자라면 32를 더해 소문자로 만든다.
                output += str.valueOf(tmp).toLowerCase();   // tmp는 char타입의 문자가 들어와야 함. 
            } else if ((tmp >= 97)&& (tmp<= 122)){ // 97 ~ 122까지
                // output += (char)(tmp - 32);  // 소문자라면 32를 빼서 대문자로 만든다.
                output += str.valueOf(tmp).toUpperCase();
            } else { // 나머지 문자들은 그대로 출력한다. 
                // output += (char)tmp;
                output += tmp;
            }
        }
        System.out.print(output);
    }
}
