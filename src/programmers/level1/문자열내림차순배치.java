package programmers.level1;



/*
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
제한 사항

    str은 길이 1 이상인 문자열입니다.

입출력 예
   s 	      return
"Zbcdefg" 	"gfedcbZ"


*/
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class 문자열내림차순배치 {
    

    // 1. toCharArray 이후에 오름차순 정렬. StringBuilder로 객체 생성 후 reverse 시키고 toString으로 출력 
    public static String solution1(String s) {
        char[] strArr = s.toCharArray();
        Arrays.sort(strArr); 
        // for (int i = strArr.length -1; i >= 0; i--) {
        //     char temp = strArr[i];
        //     answer += temp;
        // }
        return new StringBuilder(new String(strArr)).reverse().toString();
    }

    // 2. stream 으로 풀이 
    public static String solution2(String s) {
        return Stream.of(s.split(""))
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(solution2("Zbcdefg"));
    }
}
