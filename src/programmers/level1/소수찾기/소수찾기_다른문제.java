package programmers.level1.소수찾기;

import java.util.HashSet;
import java.util.Iterator;

public class 소수찾기_다른문제 {



    HashSet<Integer> numberSet = new HashSet<>();

    public boolean isPrime(int num){
        // 1. 0과 1은 소수가 아니다.
        if (num == 0 || num == 1){
            return false;
        }
        // 2.★핵심★에라토스테네스의 채의 limit를 계산한다.
        int lim = (int) Math.sqrt(num);

        // 3. 에라토스테네스의 채에 따라 limit 까지만 배수 여부를 확인한다.
        for (int i = 2; i <= lim; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
    public void recursive(String comb, String others) {
        // comb는 조합된 숫자, others는 아직 조합되지 않은 숫자
        // 1. 현재 조합을 set에 추가한다.
        // 중복이라면 누락, 처음이라면 포함됨.
        // 빈문자열 예외처리
        if (!comb.equals(""))
            numberSet.add(Integer.valueOf(comb));
        
        // 2. 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1));
        }


    }

    public int solution(String numbers) {
        int answer = 0;

        // 1. 모든 조합의 숫자를 만든다.
        recursive("", numbers);

        // 2. 소수의 갯수만 센다.
        Iterator<Integer> it = numberSet.iterator();
        while(it.hasNext()) {
            int number = it.next();
            if (isPrime(number)) answer++;
        }

        // 3. 소수의 갯수를 반환한다.
        return answer;
    }

    public static void main(String[] args) {
        소수찾기_다른문제 T = new 소수찾기_다른문제();
        System.out.println(T.solution("17"));
    }
}
