package programmers.level2.택배배달과수거하기;

public class Solution1 {

    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0, delivered  = 0, pickedUp = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (deliveries[i] != 0 || pickups[i] != 0) {
                int cnt = 0;

                while (delivered < deliveries[i] || pickedUp < pickups[i]) {
                    cnt++;
                    delivered += cap;
                    pickedUp += cap;
                }

                delivered -= deliveries[i];
                pickedUp -= pickups[i];

                answer += (long) cnt * (i + 1) * 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 4, 0})); // 16
    }
}
