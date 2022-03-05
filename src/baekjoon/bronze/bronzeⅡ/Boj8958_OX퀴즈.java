package baekjoon.bronze.bronzeⅡ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj8958_OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//            String s = br.readLine();
//            int sum = 0, num = 0;
//            for (int j = 0; j < s.length(); j++) {
//                char c = s.charAt(j);
//                if (c == 'X') {
//                    num = 0;
//                    continue;
//                } else {
//                    num++;
//                    sum += num;
//                }
//            }
//            System.out.println(sum);
//        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            int cnt = 0; // 연속횟수
            int sum = 0; // 누적합산

            for (byte value:br.readLine().getBytes()
                 ) {
                if (value =='O') {
                    cnt ++;
                    sum+= cnt;
                }
                else{
                    cnt = 0;
                }
            }
            sb.append(sum+"\n");
        }

        System.out.println(sb);

    }
}
