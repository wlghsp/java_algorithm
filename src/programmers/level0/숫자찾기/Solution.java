package programmers.level0.숫자찾기;

public class Solution {

    public int solution1(int num, int k) {
        int answer = -1;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - '0';
            if (tmp == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }

    public int solution(int num, int k) {
        String s = String.valueOf(num);
        int idx = s.indexOf(String.valueOf(k));
        return idx > -1 ? idx + 1 : -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(29183, 1)); // 3
        System.out.println(s.solution(232443, 4)); // 4
        System.out.println(s.solution(123456, 7)); // -1
    }
}
