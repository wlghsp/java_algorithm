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

public class Main {

    public String solution(String str) {
        String answer = "";
        String[] arr =  str.split(" ");
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLength) maxLength = arr[i].length();
        }
        for (String s : arr) {
            if (s.length() == maxLength) {
                answer = s;
                break; // 중복단어 있을 경우 맨 앞 단어 출력
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
