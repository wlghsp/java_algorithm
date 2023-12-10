package programmers.level1.시저암호;

public class Solution {

    public String solution(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            builder.append(push(c, n));
        }
        return builder.toString();
    }

    private char push(char c, int n) {
        if (!Character.isAlphabetic(c)) return c;
        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (offset + position);
    }

    public String solution1(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                if (c + n > 'z') {
                    sb.append((char) (c + n - 26));
                } else {
                    sb.append((char) (c + n));
                }
            } else if (Character.isUpperCase(c)) {
                if (c + n > 'Z') {
                    sb.append((char) (c + n - 26));
                } else {
                    sb.append((char) (c + n));
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
