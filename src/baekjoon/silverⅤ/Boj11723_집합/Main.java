package baekjoon.silverⅤ.Boj11723_집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
     비트마스킹 문제
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int bitset = 0;
        while (M-- > 0){
            String[] commands = br.readLine().split(" ");
            String command = commands[0];
            int num  = 0;

            switch (command) {
                case "add": // 원소 추가  a | (1 << p) x룰 추가 이미 있는 경우에는 연산을 무시
                    num = Integer.parseInt(commands[1]);
                    // num - 1 인 이유는 20이 들어왔을 때
                    // 2^19 자리가 20번째이기 때문이다.
                    bitset |= (1 << (num - 1));
                    break;
                case "remove": // 원소 삭제 a & ~b x가 있으면 제외하고 없으면 무시
                    num = Integer.parseInt(commands[1]);
                    bitset &= ~(1 << (num - 1));
                    break;
                case "check": // 값이 있으면 1을 없으면 0을 출력
                    num = Integer.parseInt(commands[1]);
                    sb.append((bitset & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle": // 값이 있으면 제거하고 없으면 그 값을 추가한다
                    num = Integer.parseInt(commands[1]);
                    bitset ^= (1 << (num - 1));
                    break;
                case "all": // 1~20이 포함된 집합으로 바꾼다
                    bitset |= (~0);
                    break;
                case "empty": // a & 0 을 하면 전부 0으로 만드므로 공집합이 된다
                    bitset &= 0;
                    break;
            }

        }
        System.out.println(sb);
    }
}
