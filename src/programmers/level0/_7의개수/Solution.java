package programmers.level0._7의개수;

public class Solution {

    public int solution1(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            char[] arr = String.valueOf(array[i]).toCharArray();
            for (char c : arr) {
                if (c == '7') answer++;
            }
        }
        return answer;
    }
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '7') answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{7, 77, 17})); // 4
        System.out.println(s.solution(new int[]{10, 29})); // 0
    }
}
