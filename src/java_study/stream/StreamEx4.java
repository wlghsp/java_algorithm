package java_study.stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx4 {
    public static void main(String[] args) {
        // 최종 연산 메서드

        /**
         * 요소의 출력: forEach()
         * 요소의 소모: reduce()
         * 요소의 검색: findFirst(), findAny()
         * 요소의 검사: anyMatch(), allMatch(), noneMatch()
         * 요소의 통계: count(), min(), max()
         * 요소의 연산: sum(), average()
         * 요소의 수집: collect()
         */
        List<Integer> intList = Arrays.asList(1,2,3);
        List<String> strList = Arrays.asList("Hwang", "Hong", "Kang");
        // 1)  forEach()
        // 스트림의 요소들을 순환하면서 반복해서 처리해야 하는 경우 사용
        intList.stream().forEach(System.out::println);
        intList.stream().forEach(x -> System.out.printf("%d : %d\n", x, x*x));

        // 2) reduce()
        // map과 비슷하게 동작하지만 개별연산이 아니라 누적연산이 이루어짐
        /**두개의 인자 즉 n, n+1 을 가지며 연산결과는 n 이 되고 다시 다음 요소와 연산을 하게 됩니다.
         * 즉 1,2 번째 요소를 연산하고 그 결과와 3번째 요소를 연산하는 식입니다.
         */
        int sum = intList.stream().reduce((a,b) -> (a+b)).get();
        System.out.println("sum: "+ sum);

        // 3) findFirst(), findAny()
        // 두 메서드는 스트림에서 지정한 첫번째 요소를 찾는 메서드
        // filter()와 함께 사용.
        // findAny() 는 parallelStream() 에서 병렬 처리시 가장 먼저 발견된 요소를 찾는 메서드로
        // 결과는 스트림 원소의 정렬 순서와 상관 없습니다.
        strList.stream().filter(s -> s.startsWith("H")).findFirst().ifPresent(System.out::println);
        strList.parallelStream().filter(s -> s.startsWith("H")).findAny().ifPresent(System.out::println);

    }
}
