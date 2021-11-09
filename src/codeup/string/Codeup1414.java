package codeup.string;

/*
길이가 100 이하인 문자열로 구성된 암호문을 발견하였다.

이 암호문은 예전에 작성된 것으로 판단된다.

이 문자열에서 “C”라는 문자와 “CC”라는 문자가 몇 개 있는지 조사하고자 한다.

길이가 100 이하인 문자열을 입력받아, 
"C"라는 문자와 "CC"라는 문자가 각각 몇 개 존재하는지 알아내는 프로그램을 작성하시오. 
(단, C, CC는 대소문자를 구분하지 않는다. 즉, "cC"는 "CC"와 같다.)

입력
① 첫 번째 줄에 길이가 100이하인 문자열이 입력된다. 문자는 모두 대문자 또는 소문자로 이루어진다.
② 대소문자의 구분이 없으므로 “C”는 2가지 경우, “CC”는 모두 서로 다른 4가지경우가 각각 존재할 수 있다.

출력
① 첫 번째 줄에는 문자열에서 찾은 “C”의 개수를 출력한다.
② 두 번째 줄에는 문자열에서 찾은 “CC”의 개수를 출력한다.

입력 예시   
cCCc

출력 예시
4
3


*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1414 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("");

        int c = 0;
        int cc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == 'C' || arr[i].charAt(0) == 'c' ) {
                c++;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {  // 길이 -1 을 해서 배열 인덱스 초과 에러 방지
            if ("cc".equalsIgnoreCase(arr[i] + arr[i+1])) {
                cc++;
            }
        }

        System.out.println(c);
        System.out.println(cc);


    }
}
