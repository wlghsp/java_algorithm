package programmers.level1;

/*

두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
제한 조건

    a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
    a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
    a와 b의 대소관계는 정해져있지 않습니다.

입출력 예
a 	b 	return
3 	5 	12
3 	3 	3
5 	3 	12


*/


public class 두정수사이의합 {
    

    // 1. 내 풀이에다가  for문 하나로 변경하는 코드로 수정함. for 문 초기항 조건식에 삼항연산자로 a, b 대소 비교 
    public static long solution1(int a, int b) {
        long answer = 0;
        for (int i = (a < b ? a:b); i <= (a < b ? b : a); i++) answer += i;
        return answer;
    }

    // 2. 등차 수열 합 공식 활용
    public static long solution2(int a, int b) {
        long answer = 0;
        
        return sumAtoB(Math.min(a, b), Math.max(a, b));
    }
    private static long sumAtoB(long a, long b) {
        return (b-a +1) * (a + b) / 2;
    }
    
    public static void main(String[] args) {
        System.out.println(solution2(5, 3));
    }
}
