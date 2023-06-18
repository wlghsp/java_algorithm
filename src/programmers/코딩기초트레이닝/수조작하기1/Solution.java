package programmers.코딩기초트레이닝.수조작하기1;

public class Solution {
    public int solution(int n, String control) {
        return control.chars().reduce(n, (acc, c) -> acc + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(0, "wsdawsdassw")); // -1
    }
}
