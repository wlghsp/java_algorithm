package programmers.level0.인덱스바꾸기;

public class Solution {

    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        char k = arr[num1];
        arr[num1] = arr[num2];
        arr[num2]  = k;
        return new String(arr);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("hello", 1, 2)); // "hlelo"
        System.out.println(s.solution("I love you", 3, 6)); // "I l veoyou"
    }
}
