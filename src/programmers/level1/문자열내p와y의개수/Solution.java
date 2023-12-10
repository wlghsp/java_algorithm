package programmers.level1.문자열내p와y의개수;

public class Solution {

    boolean solution(String s) {
        int ps = 0;
        int ys = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'p', 'P' -> ps++;
                case 'y', 'Y' -> ys++;

            }
        }
        return ps == ys;
    }

    boolean solution2(String s) {
        s = s.toLowerCase();
        int ps = s.length() - s.replace("y", "").length();
        int ys = s.length() - s.replace("p", "").length();
        return ps == ys;
    }

    boolean solution1(String s) {
        int cntP = 0;
        int cntY = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c == 'p') cntP++;
            else if (c == 'y') cntY++;
        }

        return cntP == cntY;
    }
}
