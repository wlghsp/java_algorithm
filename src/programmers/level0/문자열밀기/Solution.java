package programmers.level0.문자열밀기;


public class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        boolean flag = false;

        // 둘이 서로 같은 경우는 0을 반환한다.
        if (A.equals(B)) return 0;

        for (int i = 0; i < A.length(); i++) {
            A = A.charAt(A.length() - 1) + A.substring(0, A.length()-1);
            answer++;
            if (A.equals(B)) {
                flag = true;
                break;
            }
        }

        return flag ? answer : -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello", "ohell")); // 1
        System.out.println(s.solution("apple", "elppa")); // -1
    }
}
