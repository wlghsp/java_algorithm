package programmers.level1.약수의갯수와덧셈;


public class Solution {

    public int getCntOfDivisors(int num) {
        int cnt = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) cnt++;
            else if (num % i == 0) cnt+=2;
        }
        return cnt;
    }

    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cntOfDivisors = getCntOfDivisors(i);
            if (cntOfDivisors % 2 == 0) {
                answer += i;
            } else answer -= i;
        }
        return answer;
    }

}
