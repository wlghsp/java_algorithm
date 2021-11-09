package codeup.string;

/*
영어 문장이 입력된다.
그 문장에서 love가 몇 번 나오는지 출력하시오.

입력
영어 한 문장이 입력된다.(공백 있음, 최대 글자수 100)

출력
소문자 love가 몇 번 나오는지 출력한다.

입력 예시   
love lovely

출력 예시
2

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1419 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = new String[101];
        arr = str.split("");
     
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) =='l' && arr[i+1].charAt(0) == 'o' && arr[i+2].charAt(0) =='v' && arr[i+3].charAt(0) == 'e' ) {
                cnt++;
            }
        }
        System.out.println(cnt);
        
    }
}
