package programmers.코딩기초트레이닝.대소문자바꿔서출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (65 <= c && c <= 90) {
                sb.append((char)(c + 32));
            } else if (97 <= c && c <= 122) {
                sb.append((char) (c - 32));
            }
        }
        System.out.println(sb);
    }
}
