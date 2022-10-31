package programmers.level0.OX퀴즈;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] quiz) {
        for (int i = 0; i < quiz.length; i++) {
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + (Integer.parseInt(text[2]) * (text[1].equals("+") ? 1 : -1));
            quiz[i] = Integer.parseInt(text[4]) == result ? "O" : "X";
        }
        return quiz;
    }


    // 내 풀이
    public String[] solution1(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;
        for (String s : quiz) {
            String[] s1 = s.split(" ");
            if (calculate(Integer.parseInt(s1[0]), s1[1], Integer.parseInt(s1[2])) == Integer.parseInt(s1[4])){
                answer[i++] = "O";
            } else {
                answer[i++] = "X";
            }
        }
        return answer;
    }

    public int calculate(int a, String op, int b) {
        int result = 0;
        switch (op){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"}))); //["X", "O"]
        System.out.println(Arrays.toString(s.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}))); //["O", "O", "X", "O"]
    }




}
