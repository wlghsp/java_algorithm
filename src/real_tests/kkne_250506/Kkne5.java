package real_tests.kkne_250506;

public class Kkne5 {
    public int solution(int[] prices) {
        int answer = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            answer = Math.max(answer, price - minPrice);
        }

        return answer;
    }

    public static void main(String[] args) {
        Kkne5 kkne5 = new Kkne5();
        int res1 = kkne5.solution(new int[]{3, 2, 4, 8, 7});
        int res2 = kkne5.solution(new int[]{3, 4, 1, 5, 4});
        System.out.println(res1); // 6
        System.out.println(res2); // 4
    }
}
