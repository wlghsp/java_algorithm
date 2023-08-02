package programmers.코딩기초트레이닝.문자열돌리기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for (char c : a.toCharArray()) {
            sb.append(c).append("\n");
        }
        System.out.println(sb);
    }
}
