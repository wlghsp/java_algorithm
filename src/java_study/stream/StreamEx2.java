package java_study.stream;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) throws IOException {
//        String[] strArr = {"c", "b", "e", "a", "k", "d"};
//        List<String> strList = Arrays.asList(strArr);
//        Arrays.stream(strArr)
//                .distinct() // 중복 데이터 제거
//                .sorted() // 오름차순 정렬
//                .limit(5) // 5개로 제한
//                .forEach(x -> System.out.println(x)); //
//
//        // Stream 생성
//        // Empty Stream
//        // 비어 있는 스트림을 생성하기 위해서는 empty()메서드를 사용
//        Stream<String> streamEmpty = Stream.empty();
//
//        // Array Stream
//        // 배열로부터 스트림을 생성하는 방법은 여러가지
//        Stream<String> arrayStream = Stream.of("a", "b", "c");
//        String[] arr = new String[]{"a", "b" ,"c"};
//        Stream<String> arrayFullStream = Arrays.stream(arr);
//        Stream<String> arrayPartStream = Arrays.stream(arr, 1, 3);

        // Collection Stream
        // Collection, List, Set는 stream()메서드와 parallelStream()메서드 사용 가능
        // Map의 경우 key 혹은 value값만 리스트로 추출한 다음 스트림을 만들어 사용 가능
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> collectionStream = collection.stream();

        List<String> names = new ArrayList<>();
        names.add("Kang");
        names.add("Hong");
        names.stream().forEach(System.out::println);

        // String Stream
        // String, StringBuffer, StringBuilder는 문자열 시퀀스를 반환하는 chars()메서드 가짐고 이를 통해 스트림 생성
        IntStream charsStream = "abc".chars();
        String str = "Hello World";


        // File Stream
        // 파일의 경우 자바 NIO의 Files클래스를 이용해 문자열 스트림 생성 가능
        Path path = Paths.get("C:/Tmp/testfile.txt");
        Stream<String> streamOfStrings = Files.lines(path);
        Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));

        // 병렬 스트림(Parallel Stream)
        // fork & join 프레임웍을 이용해 자동적으로 연산을 병렬로 수행
        // 스트림 생성시 parallel() 메서드 실행
        // 병렬처리 중단 sequential()


        
        
        
    }
}
