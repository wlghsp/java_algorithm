package java_study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_NamEx2 {
    public static void main(String[] args) {
            // 스트림은 데이터 소스로부터 데이터를 읽기만 할 뿐 변경하지 않는다. 
        
//        List<Integer> list = Arrays.asList(3,1,5,4,2);
//        List<Integer> sortedList = list.stream().sorted()       //  list를 정렬해서
//                .collect(Collectors.toList());                  // 새로운 list에 저장
//        System.out.println(list);
//        System.out.println(sortedList);
//
//
//        // 스트림은 Iterator처럼 일회용이다. (필요하면 다시 스트림을 생성해야 함.)
//        Stream<String> strStream = Stream.of(new String[]{"a", "b", "c"}); // 배열
//        strStream.forEach(System.out::println); // 모든 요소를 화면에 출력(최종연산)
////        int numOfStr = strStream.count();       //. 에러 스트림이 이미 닫혔음.
//
//        // 최종 연산 전까지 중간연산이 수행되지 않는다. -- 지연된 연산
//        IntStream intStream = new Random().ints(1, 46); // 1~45범위의 무한 스트림
//        intStream.distinct().limit(6).sorted() // 중간 연산
//                .forEach(i -> System.out.print(i + ",")); // 최종 연산

        // 스트림은 작업을 내부 반복으로 처리한다.

        // 스트림의 작업을 병렬로 처리 - 병렬스트림
        // 멀티쓰레드, 함수형프로그래밍 빅데이터 처리 큰 작업
        Stream<String> strStream1 = Stream.of("dd", "aaa", "CC", "cc", "b");
        int sum = strStream1.parallel() // 병렬 스트림으로 전환 (속성만 변경)
                .mapToInt(s -> s.length()).sum();   // 모든 문자열의 길이의 합
        System.out.println(sum);
                    
        // 기본형 스트림 -IntStream, LongStream, DoubleStream
        // 오토박싱& 언박싱의 비효율이 제거됨(Stream<Integer> -> IntStream 사용)
        // 숫자와 관련된 유용한 메서드를 Stream<T> 보다 더 많이 제공


        
    }

}
