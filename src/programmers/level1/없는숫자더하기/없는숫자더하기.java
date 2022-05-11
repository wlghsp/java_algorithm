package programmers.level1.없는숫자더하기;


import java.util.Arrays;
import java.util.stream.IntStream;

public class 없는숫자더하기 {

    public static int solution1(int[] numbers) {

        // 0~9까지 스트림으로 만들고 filter로 numbers와
        return IntStream.rangeClosed(0, 9).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
    }
    public static int solution(int[] numbers) {

        return 45 - Arrays.stream(numbers).sum();
    }



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers1 = {5,8,4,0,6,7,9};

        System.out.println(solution(numbers)); // 14
        System.out.println(solution(numbers1)); // 6
    }
}
