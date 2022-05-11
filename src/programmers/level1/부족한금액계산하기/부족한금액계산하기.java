package programmers.level1.부족한금액계산하기;

public class 부족한금액계산하기 {
    public static long solution(int price, int money, int count) {
        long answer = -1;
        long cost = 0;
        for (int i = 1; i < count +1; i++) {
            cost += price * i;

        }

        if (cost > money) answer = cost - money;
        else answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(solution(price, money, count));
    }
}
