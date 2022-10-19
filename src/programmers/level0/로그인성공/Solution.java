package programmers.level0.로그인성공;

public class Solution {

    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean noIdMatch = true;
        for (String[] s : db) {
            if (id_pw[0].equals(s[0]) && id_pw[1].equals(s[1])) {
                answer = "login";
                return answer;
            }
            if (id_pw[0].equals(s[0])) {
                noIdMatch = false;
            }
        }
        if (noIdMatch) answer = "fail";
        else answer = "wrong pw";

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}})); // "login"
        System.out.println(s.solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}})); // "wrong pw"
        System.out.println(s.solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}})); // "fail"
    }
}
