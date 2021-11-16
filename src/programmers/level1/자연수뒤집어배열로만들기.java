package programmers.level1;


/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
제한 조건

    n은 10,000,000,000이하인 자연수입니다.

입출력 예
n 	       return
12345 	[5,4,3,2,1]


*/
import java.util.Arrays;


public class 자연수뒤집어배열로만들기 {

    // 내 풀이 
    static int[] solution1(long n) {
        String[] arr = Long.toString(n).split("");
        System.out.println(Arrays.toString(arr));
        int[] answer = new int[arr.length];
        int j = 0;
        for (int i = arr.length -1; i >= 0; i--) answer[j++] = Integer.parseInt(arr[i]);
        return answer;
    }
    // 다른 사람 풀이 
    static int[] solution2(long n) {
        String a = "" + n;                  // Long.toString 과 같음 String으로 변환하는 편법
        int[] answer = new int[a.length()];
        int i = 0;
        while (n > 0) {
            answer[i++] = (int)(n%10); // 1의 자리부터 배열에 집어 넣음
            n /= 10; // 숫자의 1의자리를 없앰 
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(12345)));
    }
}
