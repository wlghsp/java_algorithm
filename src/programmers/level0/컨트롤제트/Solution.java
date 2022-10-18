package programmers.level0.컨트롤제트;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {


    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) list.remove(list.size()-1);
            else list.add(arr[i]);
        }
        for (String s1 : list) answer += Integer.parseInt(s1);
        return answer;
    }

    public int solution1(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        Stack<String> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) stk.pop();
            else stk.push(arr[i]);
        }
        for (String s1 : stk) {
            answer += Integer.parseInt(s1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1 2 Z 3")); // 4
        System.out.println(s.solution("10 20 30 40")); // 100
        System.out.println(s.solution("10 Z 20 Z 1")); // 1
    }
}
