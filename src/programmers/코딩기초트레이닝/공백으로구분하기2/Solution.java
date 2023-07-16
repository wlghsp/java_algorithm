package programmers.코딩기초트레이닝.공백으로구분하기2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

    public String[] solution(String my_string) {
        // \\ 는 이스케이프 문자로서, 특수 문자를 표현하는 데 사용됩니다.
        // 여기서는 ('\') 백슬래시 자체를 표현하기 위해 두 번 사용되었습니다.
        // + 는 바로 앞에 있는 패턴이 한 번 이상 반복되어야 함
        // 하나 이상의 연속된 공백 문자를 찾습니다.
//        return my_string.trim().split("\\s+");
        return my_string.trim().split("[ ]+");
    }

    public String[] solution1(String my_string) {
        return Stream.of(my_string.split(" "))
                .filter(x -> x.length() > 0)
                .toArray(String[]::new);
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(" i    love  you")));
        System.out.println(Arrays.toString(s.solution("    programmers  ")));
    }
}
