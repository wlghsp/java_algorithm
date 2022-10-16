package programmers.level0.외계어사전;

import java.util.Arrays;

public class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String s : dic) {
            int answer = 0;
            for (int i = 0; i < spell.length; i++) {
                if (s.contains(spell[i])) answer++;
            }
            if (answer == spell.length) return 1;
        }
        return 2;
    }

    public int solution1(String[] spell, String[] dic) {
        boolean flag = false;
        Arrays.sort(spell);
        String a = String.join("", spell);
        for (String s : dic) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if (str.contains(a)) flag = true;
        }
        return flag ? 1 : 2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"})); // 2
        System.out.println(s.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"})); // 1
        System.out.println(s.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"})); // 2
    }
}
