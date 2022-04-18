package kakao.finished.신규아이디추천;

import java.util.Locale;

// https://www.youtube.com/watch?v=KGmuGWMzXx8
// https://programmers.co.kr/learn/courses/30/lessons/72410
public class 신규아이디추천_정규식 {

    // 정규식 풀이
    // String.replaceAll('From','To')
    public String solution(String new_id) {
        String answer = "";
        // 1. 소문자로 치환
        new_id = new_id.toLowerCase(Locale.ROOT);

        // 2
        answer = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3
        answer = answer.replaceAll("\\.+", ".");
        // 4. ^[.]|[.]$ 여기서 ^은 "시작한다" 따라서 쩜으로 시작한다. $는 "끝난다" 쩜으로 끝난다.
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5. 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (answer.isEmpty()) {
            answer ="a";
        }

        // 6. new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //    만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        // 7. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        신규아이디추천_정규식 T = new 신규아이디추천_정규식();
        System.out.println(T.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
