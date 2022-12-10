package programmers.level0.다항식더하기;


public class Solution {

    public String solution(String polynomial) {
        String[] split = polynomial.split(" \\+ ");
        int cntX = 0;
        int nums = 0;
        for (String s : split) {
            if (s.contains("x")) {
                if (s.length() >= 2) {
                    cntX += Integer.parseInt(s.substring(0, s.length() - 1));
                } else {
                    cntX++;
                }
            } else  {
                nums += Integer.parseInt(s);
            }
        }
        String answer = "";

        // 1. 둘다 0이면 0 반환
        if (cntX == 0 && nums == 0) return "0";
        // 2. x항이 0이면 상수 반환
        if (cntX == 0) return String.valueOf(nums);
        // 3. x항이 1이라면 x로 n이라면 n
        answer += cntX == 1 ? "x" : cntX + "x";
        // 4. 상수가 0이 아니라면 뒤에 붙여 준다.
        if (nums != 0) answer += " + " + nums;
        return answer;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution("3x + 7 + x")); // 4x + 7
        System.out.println(t.solution("x + x + x"));  // 3x
        System.out.println(t.solution("x + 7 + 15"));  //x + 22
    }
}
