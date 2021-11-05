package codeup.string;


/*
영단어 하나가 입력된다.
그 단어가 love이면 I love you. 를 출력하시오.

입력
영어 단어 하나가 입력된다.

출력
love가 입력되면 I love you.를 출력하시오. 만약 다른 단어가 입력되면 아무것도 출력하지 않는다.

입력 예시   
love

출력 예시
I love you.

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Codeup1406 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.equals("love")) {
            System.out.println("I love you.");
        }
       
    }
}
