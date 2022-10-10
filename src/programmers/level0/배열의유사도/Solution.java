package programmers.level0.배열의유사도;

public class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            String s = s1[i];
            for (int j = 0; j < s2.length; j++) {
                if (s.equals(s2[j])) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"a", "b", "c"},new String[]{"com", "b", "d", "p", "c"})); // 2
        System.out.println(s.solution(new String[]{"n", "omg"},new String[]{"m", "dot"})); // 0
    }
}
