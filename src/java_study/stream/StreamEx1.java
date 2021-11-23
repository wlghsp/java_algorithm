package java_study.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        String[] strArr = {"data1", "data2", "data3"};
        List<String> strList = Arrays.asList(strArr);

//        // 기존 방식 : 정렬 후 출력
//        Arrays.sort(strArr);
//        Collections.sort(strList);
//        for (String str: strArr
//             ) {
//            System.out.println(str);
//        }
//
//        for (String str: strList
//             ) {
//            System.out.println(str);
//        }
        strList.stream().sorted().forEach(System.out::println);
        Arrays.stream(strArr).sorted().forEach(System.out::println);
        // 람다식으로 표현
        strList.stream().sorted().forEach(x -> System.out.println(x));

    // 스트림은 어떻게 가 아니라 무엇을 할 것인지에 목적을 두고 사용해야함.
        // 연산의 파이프라인은 
        // 스트림 생성(Create) -> 중간연산(intermediate operating) -> 최종연산(Final operation)
        // . 를 이용한 메서드 체이닝으로 구현
    // 중간 연산 메서드는 리턴 타입이 스트림이므로 계속해서 다른 스트림 메서드를 연결해 사용할 수 있음
        // 최종연산 메서드는 리턴타입이 스트림이 아닌 것으로 메서드 체이닝을 끝내는 역할을 함.
        // 최종연산이 실행되어야 중간연산도 처리되기 때문에 중간연산만으로 구성된 메서드 체인은 실행되지 않음

        
    }
}
