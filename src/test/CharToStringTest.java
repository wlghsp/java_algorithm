package test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharToStringTest {
    public static void main(String[] args) {
        // 1. String 생성자 : char 배열을 문자열로 변환
        // char 배열을 String 생성자의 인자로 넣으면 문자열로 변환되어 String 객체가 생성된다
//        char[] charArray = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
//        String str = new String(charArray);
//        System.out.println(str);

        // 2. String.valueOf() : char를 문자열로 변환
        // String.valueOf() 의 인자로 char[]를 전달하면 문자열로 변환된 String 객체가 생성된다
//        char[] charArray = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
//        String str = String.valueOf(charArray);
//        System.out.println(str);

        // 3. StringBuilder : char를 문자열로 변환
        // StringBuilder를 이용하여 다음과 같이 char[]를 문자열로 변환할 수 있다
//        char[] charArray = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
//        StringBuilder sb = new StringBuilder();
//        for (char c : charArray) {
//            sb.append(c);
//        }
//        String str = sb.toString();
//        System.out.println(str);

        // 4. Stream : char를 문자열로 변환
        // Stream으로 char[]를 String으로 변환하고, String들을 합쳐서 하나의 String 으로 만들 수 있다
        Character[] charArray = {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        Stream<Character> charStream = Arrays.stream(charArray);
        String str = charStream.map(String::valueOf).collect(Collectors.joining());
        System.out.println(str);

    }
}
