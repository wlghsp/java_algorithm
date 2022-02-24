package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://yenny-zzang.tistory.com/43
// 위 블로그 보고 적었음.. 생각보다 어려웠움 ㅜㅜ
public class Boj1075_나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        n = (n/100)*100; // 마지막 2자리 00으로 바꾸기
        while(n%f != 0)  // 나누어 떨어지는 숫자 찾기
            n++;

        n %= 100; //나누어 떨어진 수의 뒤 2자리 추출

        if (n< 10) System.out.println("0" + n);
        else System.out.println(n);


    }
}
