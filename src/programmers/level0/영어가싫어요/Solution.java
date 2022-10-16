package programmers.level0.영어가싫어요;

public class Solution {

    public long solution(String numbers) {
        String[] nums = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String num = "";
        int i = 0;
        for (String s : nums) {
            numbers = numbers.replace(s, String.valueOf(i));
            i++;
        }
        return Long.parseLong(numbers);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("onetwothreefourfivesixseveneightnine")); // 123456789
        System.out.println(s.solution("onefourzerosixseven")); // 14067
    }
}
