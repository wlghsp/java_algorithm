package programmers.level1;

public class 소수만들기 {

    public int solution(int[] nums) {
        int answer = -1;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    private boolean isPrime(int num) {       // 절반까지 확인, 절반을 초과하는 수가 숫자를 나눠서 0이 나올 수 없다.
        for (int i = 2; i*i <= num; i++) { //제곱값까지만 확인
            if (num % i ==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }



}
