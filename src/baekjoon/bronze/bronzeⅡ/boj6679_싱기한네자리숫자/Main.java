package baekjoon.bronze.bronzeⅡ.boj6679_싱기한네자리숫자;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 1000; i < 10000; i++) {
            String ten = Integer.toString(i);
            String twelve = Integer.toString(i, 12);
            String sixteen = Integer.toString(i, 16);
            if (getSum(twelve) == getSum(sixteen) && getSum(sixteen) == getSum(ten)) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);

    }

    public static int getSum(String num) {
        int answer = 0;
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            int n = 0;
            if ('0' <= ch && ch <= '9') {
                n = ch - '0';
            } else if ('a' <= ch && ch <= 'z') {
                n = ch - 'a' + 10;
            }
            answer += n;
        }
        return answer;
    }
}
