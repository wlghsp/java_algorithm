package baekjoon.silverⅤ.Boj11723_집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {


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
                case "add": // 원소 추가  a | (1 << p)
                    num = Integer.parseInt(commands[1]);
                    // num - 1 인 이유는 20이 들어왔을 때
                    // 2^19 자리가 20번째이기 때문이다.
                    bitset |= (1 << (num - 1));
                    break;
                case "remove": // 원소 삭제 a & ~b
                    num = Integer.parseInt(commands[1]);
                    bitset &= ~(1 << (num - 1));
                    break;
                case "check":
                    num = Integer.parseInt(commands[1]);
                    sb.append((bitset & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(commands[1]);
                    bitset ^= (1 << (num - 1));
                    break;
                case "all": //
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
