package programmers.코딩기초트레이닝.수_조작하기2;

public class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            sb.append(switchNumber(diff));
        }
        return sb.toString();
    }

    public String switchNumber(int num) {
        String answer = "";
        switch (num) {
            case 1:
                answer = "w";
                break;
            case -1:
                answer = "s";
                break;
            case 10:
                answer = "d";
                break;
            case -10:
                answer = "a";
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        // "wsdawsdassw"
        System.out.println(s.solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}
