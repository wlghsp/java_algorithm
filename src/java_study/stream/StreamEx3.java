package java_study.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {

        // 중간 연산 메서드

        /**
         * 스트림 필터링: filter(), distinct()
         * 스트림 변환: map(), flatMap()
         * 스트림 제한: limit(), skip()
         * 스트림 정렬: sorted()
         * 스트림 연산 결과 확인: peek()
         * 타입변환: asDoubleStream(), asLongStream(), boxed()
         *
          */

        List<Integer> intList = Arrays.asList(1,2,3);
        List<String> strList = Arrays.asList("Hwang", "Hong", "Kang");

        // 1) filter(), distinct()
        // 스트림 요소를 필터링하기 위한 메서드

        // filter()는 스트림 요소마다 비교문을 만족(true)하는 요소로 구성된 스트림 반환
        // 특정 조건에 맞는 값만 추리기 위한 용도
        // distinct()는 요소들의 중복 제거하고 스트림 반환
//        intList.stream().filter(x -> x <= 2).forEach(System.out::println); // 2 이하의 값들을 추림
//        System.out.println();
//        Arrays.asList(1,2,3,2,5).stream().distinct().forEach(System.out::println);

        // 2) map()
        // 스트림의 각 요소마다 수행할 연산을 구현할 때 사용
//        intList.stream().map(x -> x*x).forEach(System.out::println); // x * x를 하게 함. 제곱값 출력

        // 3) flatMap()
        // 기존의 요소를 새로운 요소로 대체한 스트림을 생성

//        Arrays.asList(intList, Arrays.asList(2,5)).stream()
//                .flatMap(i -> i.stream())
//                .forEach(System.out::println);
//        System.out.println();
//        strList.stream()
//                .flatMap(message -> Arrays.stream(message.split("an")))
//                .forEach(System.out::println);

        // distinct() 예제를 flatMap()을 이용
//        Arrays.asList(intList, Arrays.asList(2,5)).stream()
//                .flatMap(i -> i.stream())
//                .distinct().forEach(System.out::println);
//
        // 4) limit()
        // 스트림의 시작 요소로부터 인자로 전달되 인덱스 까지의 요소를 추출해 새로운 스트림 생성
//        intList.stream().limit(2).forEach(System.out::println);

        // 5) skip()
        // 스트림의 시작 요소로부터 인자로 전달된 인덱스까지를 제외하고 새로운 스트림을 생성
//        intList.stream().skip(2).forEach(System.out::println);

        // 6) sorted()
        // 스트림 요소를 정렬하는 메서드로 기본적으로 오름차순으로 정렬
//        Arrays.asList(1,4,3,2).stream().sorted().forEach(System.out::println);
//        System.out.println();
//        // 내림차순 정렬 Comparable 인터페이스
//        Arrays.asList(1,4,3,2).stream().sorted( (a,b) -> b.compareTo(a)).forEach(System.out::println);
//        System.out.println();
//        // 내림차순 정렬 의 다른 방법 -를 붙인다.
//        Arrays.asList(1,4,3,2).stream().sorted( (a,b) -> -a.compareTo(b)).forEach(System.out::println);
//        // 내림차순 정렬  Comparator 사용
//        Arrays.asList(1,4,3,2).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // 7) peak()
        // 결과 스트림의 요소를 사용해 추가로 동작을 수행
        //스트림 연산 과정에서 중간 중간 결과를 확인할 때 사용
        // 최종 연산인 forEach() 처럼 반복해서 요소를 처리하는 메서드 이며
        // 중간연산이므로 최종연산 메서드가 실행되지 않으면 지연되기 때문에 반드시 최종연산 메서드가 호출되어야 동작 합니다

        int sum = intList.stream().filter(x -> x<=2 )
                .peek(System.out::println)
                .mapToInt(Integer::intValue).sum();
        System.out.println("sum: " + sum);


    }
}
