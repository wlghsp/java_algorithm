package programmers.코딩기초트레이닝.조건에맞게수열변환하기2;

public class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (true) {
            boolean changed = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                    changed = true;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                    changed = true;
                }
            }
            answer++;
            if (!changed) break;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 100, 99, 98})); // 5
    }
}
