package problemSolving.getMinMax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(4, 0, 5, 2, 7, 1, 8, 6, 9, 3);
//        int max = -1;
//        for (int i = 0; i < numbers.size(); i++) {
//            int number = numbers.get(i);
//            if (max < number) {
//                max = number;
//            }
//        }

        List<Integer> numbers = Arrays.asList(4, 0, 5, 2, 7, 1, 8, 6, 9, 3);
        // Collections.max() 메서드를 사용할 때 주의 사항은 리스트가 비어있을 경우 NoSuchElementException이 발생한다는 점입니다.
        // 따라서 위와 같이 리스트가 비어있을 경우에 대한 기본값 처리가 필요합니다.
        int max = numbers.isEmpty() ? -1: Collections.max(numbers);
        int min = numbers.isEmpty() ? -1: Collections.min(numbers);
        /*
        Collections 클래스의 max()나 min()는 리스트 타입의 인자만 받는다는 한계가 있습니다.
        예를 들어, 최대값을 찾으려는 대상이 배열이라면 리스트로 일단 한 번 변환을 한 후 호출이 가능하기 때문에
        원소의 개수가 많을 경우 비효율적일 수 있습니다.
                */
        System.out.println("Max: " + max);  // Max: 9
        System.out.println("Min: " + min);  // Min: 0
    }
}
