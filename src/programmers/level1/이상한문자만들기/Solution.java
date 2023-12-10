package programmers.level1.이상한문자만들기;

public class Solution {

    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        boolean toUpper = true;
        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                builder.append(c);
                toUpper = true;
            } else {
                if (toUpper) {
                    builder.append(Character.toUpperCase(c));
                } else {
                    builder.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return builder.toString();
    }
    public String solution1(String s) {
        // -1을 limit로 넣으면 마지막으로 오는 빈문자열도 포함됨
        String[] arr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            // 단어인 경우 처리
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (i % 2 == 0) { // 대문자로
                    if (65 <= c && c <= 90) { // 대문자이면
                        sb.append(c);
                    } else { //
                        sb.append((char) (c - ('a' - 'A')));
                    }
                } else { // 소문자로
                    if (65 <= c && c <= 90) {
                        sb.append((char) (c + ('a' - 'A')));
                    } else {
                        sb.append(c);
                    }
                }
            }
            // 단어이면 뒤에 공백을 붙이지만 공백이면 공백을 삽입한다.
            sb.append(' ');
        }

        // 마지막에 붙는 공백 제거
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
