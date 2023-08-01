package programmers.코딩기초트레이닝.간단한식계산하기;

public class Solution {
    public int solution(String binomial) {
        String[] strings = binomial.split(" ");
        return calculate(strings);
    }

    public int calculate(String[] strings) {
        String operator = strings[1];
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[2]);
        int answer = 0;
        switch (operator){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            case "/":
                answer = a / b;
                break;
            default:
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("43 + 12")); // 55
        System.out.println(s.solution("0 - 7777")); // -7777
        System.out.println(s.solution("40000 * 40000")); // 1600000000

    }
}
