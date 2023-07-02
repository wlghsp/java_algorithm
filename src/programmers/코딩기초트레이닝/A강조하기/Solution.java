package programmers.코딩기초트레이닝.A강조하기;

public class Solution {

    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'a') answer.append('A');
            else if (c == 'A') answer.append(c);
            else if(Character.isUpperCase(c)) answer.append(Character.toLowerCase(c));
            else answer.append(c);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("abstract algebra")); //"AbstrAct AlgebrA"
    }
}
