package java_study.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream_NamEx4 {
    public static void main(String[] args) {

        // 객체 배열로부터 스트림 생성하기

        Stream<String> strStream1 = Stream.of("a", "b", "c"); // 가변 인자
        Stream<String> strStream2 = Stream.of(new String[] { "a", "b", "c" });
        Stream<String> strStream3 = Arrays.stream(new String[] { "a", "b", "c" });
        Stream<String> strStream4 = Arrays.stream(new String[] { "a", "b", "c" }, 0, 3);

        // 기본형 배열로부터 스트림 생성하기

    }

}
