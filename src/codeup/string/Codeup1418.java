package codeup.string;

/*
어떤 문자열이 있을 때 문자 t의 위치를 모두 찾아 출력하시오.

입력
공백이 없는 문자열이 한 줄 입력된다.(10글자 이하)

출력
소문자 t의 위치를 공백으로 분리하여 모두 출력하시오.

입력 예시   
test

출력 예시
1 4 

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1418 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == 't') {
                sb.append(i+1).append(" ");
            }
        }

        System.out.println(sb.toString());
        
    }
}
