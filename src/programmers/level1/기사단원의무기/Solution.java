package programmers.level1.기사단원의무기;

public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0; // 공격력의 합 구하기

        for (int i = 1; i <= number; i++) {
            int attack = getDivisorCnt(i);
            answer += attack > limit ? power : attack;
        }
        return answer;
    }

    /**
     * 약수의 개수 구하기
     *
     */
    private int getDivisorCnt(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) count++;
            else if (n % i == 0) count += 2;
        }
        return count;
    }

}
