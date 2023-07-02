package programmers.코딩기초트레이닝.이어붙인수;

public class Solution {
    public int solution(int[] num_list) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int n : num_list) {
            if (n % 2 == 0) {
                a.append(n);
            } else {
                b.append(n);
            }
        }
        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 4, 5, 2, 1})); // 393
        System.out.println(s.solution(new int[]{5, 7, 8, 3}));  // 581
    }
}
