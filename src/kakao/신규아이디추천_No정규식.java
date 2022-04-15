package kakao;

// https://www.youtube.com/watch?v=KGmuGWMzXx8
public class 신규아이디추천_No정규식 {

    public String solution(String new_id) {
        String answer = "";
        // 1. 소문자로 치환
        new_id = new_id.toLowerCase();
        // 2. 소문자, 숫자, 빼기, 밑줄, 마침표
        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);
            if (Character.isAlphabetic(ch) ||
                    Character.isDigit(ch) ||
            ch =='-' || ch == '_' || ch =='.') {
                answer += ch;
            }
        }
        // 3. 마침표가 2번 이상 -> 하나로 치환
        while (answer.indexOf("..") != -1) {  // indexOf 찾는 문자가 없을 때 -1을 반환
            answer = answer.replace("..", ".");
        }
        // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (!answer.isEmpty() && answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        if (!answer.isEmpty() && answer.charAt(answer.length()-1) == '.') {
            answer = answer.substring(0, answer.length()-1);
        }
        // 5. 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (answer.isEmpty()) {
            answer ="a";
        }
        // 6.  new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length()-1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        // 7. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        신규아이디추천_No정규식 T = new 신규아이디추천_No정규식();
        System.out.println(T.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
