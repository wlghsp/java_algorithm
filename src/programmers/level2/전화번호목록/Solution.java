package programmers.level2.전화번호목록;

import java.util.Arrays;

public class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        // 정렬한 상태에서는 인전한 두 전화번호만 접두어 관계를 가짐
        // 앞의 번호가 뒤 번호의 접두사인지 확인
        for (int i = 1; i < phone_book.length; i++) {
            if (phone_book[i].startsWith(phone_book[i - 1])) {
                return false;
            }
        }

        return true;
    }
}
