package java_study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx4 {
    public static void main(String[] args) {
//        // 최종 연산 메서드
//
//        /**
//         * 요소의 출력: forEach()
//         * 요소의 소모: reduce()
//         * 요소의 검색: findFirst(), findAny()
//         * 요소의 검사: anyMatch(), allMatch(), noneMatch()
//         * 요소의 통계: count(), min(), max()
//         * 요소의 연산: sum(), average()
//         * 요소의 수집: collect()
//         */
        List<Integer> intList = Arrays.asList(1,2,3);
        List<String> strList = Arrays.asList("Hwang", "Hong", "Kang");
//        // 1)  forEach()
//        // 스트림의 요소들을 순환하면서 반복해서 처리해야 하는 경우 사용
//        intList.stream().forEach(System.out::println);
//        intList.stream().forEach(x -> System.out.printf("%d : %d\n", x, x*x));
//
//        // 2) reduce()
//        // map과 비슷하게 동작하지만 개별연산이 아니라 누적연산이 이루어짐
//        /**두개의 인자 즉 n, n+1 을 가지며 연산결과는 n 이 되고 다시 다음 요소와 연산을 하게 됩니다.
//         * 즉 1,2 번째 요소를 연산하고 그 결과와 3번째 요소를 연산하는 식입니다.
//         */
//        int sum = intList.stream().reduce((a,b) -> (a+b)).get();
//        System.out.println("sum: "+ sum);
//
//        // 3) findFirst(), findAny()
//        // 두 메서드는 스트림에서 지정한 첫번째 요소를 찾는 메서드
//        // filter()와 함께 사용.
//        // findAny() 는 parallelStream() 에서 병렬 처리시 가장 먼저 발견된 요소를 찾는 메서드로
//        // 결과는 스트림 원소의 정렬 순서와 상관 없습니다.
//        strList.stream().filter(s -> s.startsWith("H")).findFirst().ifPresent(System.out::println);
//        strList.parallelStream().filter(s -> s.startsWith("H")).findAny().ifPresent(System.out::println);
//
//
//        // 4) anyMatch(), allMatch(), noneMatch()
//        // 스트림의 요소 중 특정 조건을 만족하는 요소를 검사하는 메서드
//        // 원소 중 일부, 전체 혹은 일치하는 것이 없는 경우를 검사하고 boolean값을 리턴합니다.
//        // noneMatch()의 경우 일치하는 것이 하나도 없을 때 true.
//
//        boolean result1 = strList.stream().anyMatch(s -> s.startsWith("H")); // true
//        boolean result2 = strList.stream().allMatch(s -> s.startsWith("H")); // false
//        boolean result3 = strList.stream().noneMatch(s -> s.startsWith("T")); // true
//        System.out.printf("%b, %b, %b", result1, result2, result3);

        // 5) count(), min(), max()
        // 스트림의 원소들로부터 전체 개수, 최소값, 최대값을 구하기 위한 메서드
        // min(), max() 의 경우 Comparator 를 인자로 요구 하고 있으므로
        // 기본 Comparator 들을 사용하거나 직접 람다 표현식으로 구현
        intList.stream().count(); // 3
        intList.stream().filter(n -> n != 2).count(); // 2
        intList.stream().min(Integer::compare).ifPresent(System.out::println); // 1
        intList.stream().max(Integer::compareUnsigned).ifPresent(System.out::println); // 3

        strList.stream().count();   // 3
        strList.stream().min(String::compareToIgnoreCase).ifPresent(System.out::println); // Hong
        strList.stream().max(String::compareTo).ifPresent(System.out::println); // Kang

        // 6) sum(), average()
        // 스트림 원소들의 합계를 구하거나 평균을 구하는 메서드
        // reduce(), map()을 이용해도 구현 가능. 리턴값이 Optional이므로 ifPresent()를 이용해 값 출력
        intList.stream().mapToInt(Integer::intValue).sum(); // 6
        intList.stream().reduce((a,b) -> a + b).ifPresent(System.out::println); // 6

        intList.stream().mapToInt(Integer::intValue).average(); // 2
        intList.stream().reduce((a, b) -> a + b).map(n -> n/ intList.size()).ifPresent(System.out::println);

        // 7) collect()
        // 스트림의 결과를 모으기 위한 메서드로 Collectors객체에 구현된 방법에 따라 처리하는 메서드
        /**
         * 스트림을 배열이나 컬렉션으로 변환: toArray(), toCollection(), toList(), toSet(), toMap()
         * 요소의 통계와 연산 메소드와 같은 동작을 수행: counting(), maxBy(), minBy(), summingInt(), averagingInt() 등
         * 요소의 소모와 같은 동작을 수행 : reducing(), joining()
         * 요소의 그룹화와 분할: groupingBy(), partitioningBy()
         */
         strList.stream().map(String::toUpperCase).collect(Collectors.joining("/"));
         // Hwang/Hong/Kang
         strList.stream().collect(Collectors.toMap(k -> k, v -> v.length()));
         // { Hong=4, Hwang=5, Kang=4}

        intList.stream().collect(Collectors.counting());
        intList.stream().collect(Collectors.maxBy(Integer::compare));
        intList.stream().collect(Collectors.reducing( (a, b) -> a + b)); // 6
        intList.stream().collect(Collectors.summarizingInt(x -> x)); // IntSummaryStatistics {count=3, sum=6, min=1, average=2.000000, max=3}

        Map<Boolean, List<String>> group = strList.stream().collect(Collectors.groupingBy(s -> s.startsWith("H")));
        group.get(true).forEach(System.out::println); // Hwang, Hong

        Map<Boolean,List<String>> partition = strList.stream().collect(Collectors.partitioningBy(s -> s.startsWith("H")));
        partition.get(true).stream().forEach(System.out::println); // Hwang, Hong

    }
}
