package programmers.level2.택배배달과수거하기;

public class Solution {

    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int i = n - 1;
        int j = n - 1;
        while (i >= 0 || j >= 0) {
            while (i >= 0 && deliveries[i] == 0) {i--;}
            while (j >= 0 && pickups[j] == 0) {j--;}
            if (i < 0 && j < 0) break;

            int far = Math.max(i, j);

            answer += (far + 1) * 2L;
            int capD = cap;
            int capP = cap;

            // 배달: i 포인터만 이동
            while (capD > 0 && i >= 0) {
                if (deliveries[i] == 0) {
                    i--;
                    continue;
                }
                int deliver = Math.min(capD, deliveries[i]);
                deliveries[i] -= deliver;
                capD -= deliver;
                if (deliveries[i] == 0) {i--;}
            }

            // 수거: j 포인터만 이동
            while (capP > 0 && j >= 0) {
                if (pickups[j] == 0) {
                    j--;
                    continue;
                }
                int pickup = Math.min(capP, pickups[j]);
                pickups[j] -= pickup;
                capP -= pickup;
                if (pickups[j] == 0) {j--;}
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 4, 0})); // 16
    }
}
