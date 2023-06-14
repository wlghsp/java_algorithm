package programmers.코딩기초트레이닝.rny_string;

public class Solution {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("masterpiece")); // 	"rnasterpiece"
        System.out.println(s.solution("programmers")); // 	"prograrnrners"
        System.out.println(s.solution("jerry")); // 	"jerry"
        System.out.println(s.solution("burn")); // 	"burn"
    }
}
