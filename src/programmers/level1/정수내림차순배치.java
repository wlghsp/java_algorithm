package programmers.level1;


/*
문제 설명

함수 solution은 정수 n을 매개변수로 입력받습니다. 
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건

    n은 1이상 8000000000 이하인 자연수입니다.

입출력 예
n 	    return
118372 	873211


*/
import java.util.Arrays;
import java.util.Collections;


public class 정수내림차순배치 {

    static long solution(long n) {
        long answer = 0;

        String a = "" + n; // String으로 변환
        int[] result = new int[a.length()];
        int i = 0;
        while (n > 0) {
            result[i++] = (int)(n% 10); // 1의 자리 숫자 배열에 삽입
            n /= 10;  // 1의 자리 숫자 없앰
        }
        Integer[] arr3 = Arrays.stream(result).boxed().toArray(Integer[]::new);
        Arrays.sort(arr3, Collections.reverseOrder());
        String tmp = "";
        for (Integer k : arr3) {
            tmp += String.valueOf(k);
        }
        answer = Long.parseLong(tmp);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
