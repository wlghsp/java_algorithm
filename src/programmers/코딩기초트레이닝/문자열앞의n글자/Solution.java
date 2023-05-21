package programmers.코딩기초트레이닝.문자열앞의n글자;

public class Solution {

    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string1 = "ProgrammerS123";
        String my_string2 = "He110W0r1d";
        int n1 = 11;
        int n2 = 5;
        System.out.println(s.solution(my_string1, n1));
        System.out.println(s.solution(my_string2, n2));
    }
}
