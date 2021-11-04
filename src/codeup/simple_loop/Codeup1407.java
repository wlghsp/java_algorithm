package codeup.simple_loop;



/*
길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.

입력
문자열이 입력된다.(글자 수는 100글자 이하이고, 알파벳 대소문자와 공백 문자만 입력된다.)

출력
공백을 제거한 후 출력한다.

 
입력 예시   
abC Def gh

출력 예시
abCDefgh


*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Codeup1407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 자바 문자열 공백 제거 방법
        // 1. replaceAll()
        // String result = str.replaceAll("\\s", "");
        // System.out.println(result);


        // 2. replace()
        // String result1 = str.replace(" ", "");
        // System.out.println(result1);

        // 3. Pattern 및 Matcher
        Pattern p = Pattern.compile("[\\s]");
        Matcher m = p.matcher(str);
        String result2 = m.replaceAll("");
        System.out.println(result2);

    }
}
