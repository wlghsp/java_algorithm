package inflearn.string_문자열.q3_문장속단어;

/**
 설명

 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

 문장속의 각 단어는 공백으로 구분됩니다.


 입력
 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.


 출력
 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한

it is time to study

 study

 */


import java.util.Scanner;

public class Main3 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        // indexOf 와 subString 사용하여 풀이
        while ((pos = str.indexOf(' '))  != -1) {
            String tmp = str.substring(0, pos); // pos 전까지
            int len = tmp.length();
            if (len > m) { // => 같다로 하면 뒤에서 나온 답을 답으로 할 수 있음. 이렇게 해야 앞쪽에서 발견된 단어가 답이 됨.
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1); // 위에서 판별한 단어는 제외하고 str에 저장하여 반복됨.
        }
        // 반복문의 마지막 단어는 뒤에 공백이 없어 반복문이 종료되어 길이 대조를 못함.
        // 마지막 단어 체크
        if(str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 1줄을 입력 받기 위해서는 nextLine() 사용
        System.out.println(T.solution(str));
    }
}
