package codeup.string;

/*
순환문자열

영어 소문자로 구성된 단어 S1, S2, S3가 있을때,
S1의 마지막 문자가 S2의 첫 글자와 같고,
S2의 마지막 글자가 S3의 첫 글자와 같고,
S3의 마지막 글자가 S1의 첫 글자와 같으면 순환 문자열이라고 한다.
예를 들어 turtle error robot 인 경우 순환 문자열이다.
세 단어가 주어졌을 때 순환 문자열이면 good을 출력, 아니면 bad를 출력하시오.

입력
영어 소문자로 구성된 단어 S1, S2, S3가 각 줄에 한개씩 입력된다.(각 문자열에 공백은 없으며 길이는 2글자 이상 20글자 이하이다.)

출력
순환 문자열이면 good을 출력, 아니면 bad를 출력하시오.

입력 예시   
turtle
error
robot

출력 예시
good


*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup2721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split("");
        String[] str2 = br.readLine().split("");
        String[] str3 = br.readLine().split("");

        if (str1[str1.length -1].charAt(0) == str2[0].charAt(0) && str2[str2.length -1].charAt(0) == str3[0].charAt(0) && str3[str3.length -1].charAt(0) == str1[0].charAt(0)) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}
