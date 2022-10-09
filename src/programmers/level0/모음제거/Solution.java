package programmers.level0.모음제거;

public class Solution {

    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("bus"));  // "bs"
        System.out.println(s.solution("nice to meet you")); // "nc t mt y"
     }
}
