package baekjoon.silverⅤ;


public class Boj4673_셀프넘버 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if (n < 10001) { // 10000이 넘는 수는 필요가 없음
                check[n] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if (!check[i]) { // false인 인덱스만 출력
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int number) {
        int sum = number;

        while (number != 0) {
            sum = sum + (number % 10); // 첫째 자릿수
            number = number/10; // 10으로 나누어 첫째자리를 없앤다.
        }
        return sum;
    }
}
