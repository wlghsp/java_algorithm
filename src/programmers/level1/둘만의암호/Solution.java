package programmers.level1.둘만의암호;

public class Solution {

    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : skip.toCharArray()) {
            alphabet = alphabet.replace(Character.toString(c), "");
        }
        for (char c : s.toCharArray()) {
            int num = (alphabet.indexOf(c) + index) % alphabet.length() ;
            sb.append(alphabet.charAt(num));
        }

        return sb.toString();
    }
}
