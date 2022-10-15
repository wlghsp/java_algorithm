package baekjoon.bronze.bronzeⅡ.boj6679_싱기한네자리숫자;

public class Main2 {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1000; i < 10000; i++) {

            int sum_10 = 0;
            int sum_12 = 0;
            int sum_16 = 0;

            for (int j = i; j > 0; j/=10) {
                sum_10 += j % 10;
            }

            for (int j = i; j > 0; j/=12) {
                sum_12 += j % 12;
            }

            for (int j = i; j > 0; j/=16) {
                sum_16 += j % 16;
            }

            if (sum_10 == sum_12 && sum_12 == sum_16) sb.append(i + "\n");
        }

        System.out.println(sb);
    }
}
