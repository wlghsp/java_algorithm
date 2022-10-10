package programmers.study_group.oct_1st_week.성격유형검사하기;

import java.util.*;

public class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        Character[] arr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (Character c : arr) hm.put(c, 0);

        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            if (choices[i] == 1) hm.put(s.charAt(0), hm.get(s.charAt(0)) + 3);
            else if (choices[i] == 2) hm.put(s.charAt(0), hm.get(s.charAt(0)) + 2);
            else if (choices[i] == 3) hm.put(s.charAt(0), hm.get(s.charAt(0)) + 1);
            else if (choices[i] == 5) hm.put(s.charAt(1), hm.get(s.charAt(1)) + 1);
            else if (choices[i] == 6) hm.put(s.charAt(1), hm.get(s.charAt(1)) + 2);
            else if (choices[i] == 7) hm.put(s.charAt(1), hm.get(s.charAt(1)) + 3);
        }

        answer += hm.get('R') >= hm.get('T') ? 'R' : 'T';
        answer += hm.get('C') >= hm.get('F') ? 'C' : 'F';
        answer += hm.get('J') >= hm.get('M') ? 'J' : 'M';
        answer += hm.get('A') >= hm.get('N') ? 'A' : 'N';

        return answer;
    }

    public static void main(String[] args) {
        Solution S = new Solution();
        String[] survey1 = {"AN", "CF", "MJ", "RT", "NA"};
        String[] survey2 = {"TR", "RT", "TR"};
        int[] choices1 = {5, 3, 2, 7, 5};
        int[] choices2 = {7, 1, 3};
        System.out.println(S.solution(survey1, choices1));  // "TCMA"
        System.out.println(S.solution(survey2, choices2));  // "RCJA"
    }
}
