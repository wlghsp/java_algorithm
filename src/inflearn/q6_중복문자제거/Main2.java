package inflearn.q6_중복문자제거;

import java.util.Scanner;

public class Main2 {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));

            //  indexOf를 활용한 풀이 indexOf는 앞에서부터 찾는다.
            // 문자의 인덱스(위치)와 indexOf로 나온 위치가 같다면 처음 나온 문자이다.위 프린트문을 출력해보면 알 수 있다.
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Main2 T = new Main2();
        System.out.println(T.solution(s));
    }
}
