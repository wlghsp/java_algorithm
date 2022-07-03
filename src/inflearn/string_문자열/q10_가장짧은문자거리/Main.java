package inflearn.string_문자열.q10_가장짧은문자거리;

import java.util.Scanner;


// teachermode e
// 1 0 1 2 1 0 1 2 2 1 0
public class Main {

    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];

        char[] x = s.toCharArray();

        int p = 1000;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == t) {
                p = 0;
                answer[i] = p; // t를 만나면 0으로 초기화 하는 것임
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i = x.length-1; i>=0 ; i--) {
            if (x[i] == t) {
                p = 0; // 같을 때는 그냥 max 초기화, push는 이미 오른쪽 방향일때 했음.
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String[] str= sc.nextLine().split(" ");
        String s = str[0];
        char t = str[1].charAt(0);
        for (int x: T.solution(s, t)
             ) {
            System.out.println(x + " ");
        }
    }
}
