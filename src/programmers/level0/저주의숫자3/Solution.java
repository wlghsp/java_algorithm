package programmers.level0.저주의숫자3;

public class Solution {

    // n까지 범위를 설정하고 answer를 증가시키다가
    // 3의 배수나 3이 포함되는 경우는 i를 감소시킨다.
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }
        return answer;
    }

    // 내 풀이
    // 100까지 숫자를 채워넣었다. 그래서 185가 100번째로 차는 걸 디버깅으로 확인했어야했다.
    public int solution1(int n) {
        int[] town3 = new int[101];
        int j = 1;
        for (int i = 1; i < 186; i++) {
            if (i % 3 != 0 && !String.valueOf(i).contains("3")) {
                town3[j++] = i;
            }
        }
        return town3[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(15));  // 25
        System.out.println(s.solution(40));  // 76

    }
}
