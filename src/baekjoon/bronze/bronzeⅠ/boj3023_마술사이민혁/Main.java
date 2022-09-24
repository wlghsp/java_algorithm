package baekjoon.bronze.bronzeⅠ.boj3023_마술사이민혁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /*
     이게 풀리려나 하면서 해본 건데 어찌어찌 풀렸다.
     패턴파악을 해야한다. 어떻게라도 첫번째 예제라도 풀릴 코드를 작성하여보니 풀렸다.

     1. 왼쪽 위 문자입력을 거꾸로 뒤집은 것과 합쳐서 1차원 스트링 배열에 문자열로 담고
        다시 남은 아래는 위에 들어간 문자열을 뒤에 인덱스부터 시작해서
        위에서 첫번째 R줄 다음의 인덱스부터 R번 다시 반복문으로 집어 넣는다.

     2. S배열에 출력될 카드가 완성되고 여기서 출력할 때 에러 위치의 문자만 바꾸어 출력해준다.

      이렇게 스스로 푼 문제는 다른 풀이 중에 좀 더 최적화되고 다음에도 활용 가능할 풀이를 찾아서 공부해야 한다.
      char 2차원 배열로 푸는 풀이를 참고하겠음
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String[] S = new String[2*R];
        StringBuilder sb;
        int i = 0;

        for (; i < R; i++) {
            String tmp = br.readLine();
            sb = new StringBuilder(tmp);
            S[i] = tmp + sb.reverse();
        }

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for (int j = S.length/2 - 1; j >= 0; j--) {
            S[i++] = S[j];
        }

        sb = new StringBuilder();
        for (int j = 0; j < S.length; j++) {
            char[] arr = S[j].toCharArray();
            for (int k = 0; k < arr.length; k++) {
                char c = arr[k];
                if (j == (A-1) && k == (B-1)) {
                    if (c== '.') sb.append('#');
                    else sb.append('.');
                } else {
                    sb.append(c);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
