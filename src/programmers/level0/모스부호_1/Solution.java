package programmers.level0.모스부호_1;


import java.util.HashMap;

public class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] arr = letter.split(" ");
        for (String s : arr) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(s)) answer += alpha[j] + "";
            }
        }

        return answer;
    }

    // 내 풀이
    public String solution1(String letter) {
        HashMap<String, String> hm = new HashMap<>();
        String[][] morse = {
                {".-","a"},{"-...","b"},{"-.-.","c"},{"-..","d"},{".","e"},{"..-.","f"},
                {"--.","g"},{"....","h"},{"..","i"},{".---","j"},{"-.-","k"},{".-..","l"},
                {"--","m"},{"-.","n"},{"---","o"},{".--.","p"},{"--.-","q"},{".-.","r"},
                {"...","s"},{"-","t"},{"..-","u"},{"...-","v"},{".--","w"},{"-..-","x"},
                { "-.--","y"},{"--..","z"}
        };

        for (int i = 0; i < 26; i++) hm.put(morse[i][0], morse[i][1]);

        String[] leArr = letter.split(" ");

        for (int i = 0; i < leArr.length; i++) leArr[i] = hm.get(leArr[i]);

        return String.join("", leArr);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(".... . .-.. .-.. ---"));         // "hello"
        System.out.println(s.solution(".--. -.-- - .... --- -."	));  // "python"
    }
}
