package java_study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_NamEx1 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        Stream<Integer> intStream = list.stream(); // 컬렉션
//        Stream<String> strStream = Stream.of(new String[]{"a", "b", "c"}); // 배열
//        Stream<Integer> evenStream = Stream.iterate(0, n -> n+2); // 0,2,4,6
//        Stream<Double> randomStream = Stream.generate(Math::random); // 람다식
//        IntStream intStream2 = new Random().ints(5); // 난수 스트림 (크기가 5)


        /**
         *
         * 중간연산 - 연산결과가 스트림인 연산, 반복적으로 적용가능 0~n번
         * 최종 연산- 연산결과가 스트림이 아닌 연산, 단 한번만 적용가능(스트림의 요소를 소모) 0~1번
         *
         */

//        String[] strArr = {"dd", "aaa", "CC", "cc", "b"};
//        Stream<String> stream = Stream.of(strArr); // 문자열 배열이 소스인 스트림
//        Stream<String> filteredStream = stream.filter(); // 걸러 내기 (중간 연산)
//        Stream<String> distinctedStream = stream.distinct(); // 중복 제거 (중간 연산)
//        Stream<String> sortedStream = stream.sorted(); // 정렬(중간 연산)
//        Stream<String> limitedStream = stream.limit(5); // 스트림 자르기 (중간 연산)
//        int total = stream.count(); // 요소 개수 세기 (최종 연산)
    }

}
