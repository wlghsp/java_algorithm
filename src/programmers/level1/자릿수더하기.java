package programmers.level1;

/*
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
제한사항

    N의 범위 : 100,000,000 이하의 자연수

입출력 예
N 	answer
123 	6
987 	24
입출력 예 설명

입출력 예 #1
문제의 예시와 같습니다.

입출력 예 #2
9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.


*/

public class 자릿수더하기 {
    // 내 풀이
    public static int solution1(int n) {
      String str = String.valueOf(n);
      int result = 0;
      for (int i = 0; i < str.length(); i++) result += (str.charAt(i) -'0');
      return result;
    }

    // 다른 사람 풀이.. 형변환 없이 이렇게 풀어줘야 함. 
    public static int solution2(int n) {
        int result = 0;
        // 1의 자릿수만 계속 더해 가는 방법
        while (true) {
            result += n % 10; // 매번 1의 자리를 더함. 
            if (n < 10) break;
            n = n / 10; // 맨 뒤 1의 자리 줄임 10의 자릿수가 1의 자릿수 됨. 
        }
        return result;
      }

    public static void main(String[] args) {
        System.out.println(solution1(123));
        System.out.println(solution1(987));
    }
}
