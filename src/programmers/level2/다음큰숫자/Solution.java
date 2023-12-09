package programmers.level2.다음큰숫자;

public class Solution {

    public int solution(int n) {
        int zeroCntOfBinaryN = countOne(Integer.toBinaryString(n));
        int num = n + 1;
        while (countOne(Integer.toBinaryString(num)) != zeroCntOfBinaryN) {
            num++;
        }

        return num;
    }

    private int countOne(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }

    /**
     * Integer.bitCount
     * 숫자 n이 2진수일때 1의 갯수를 반환
     */
    public int solution1(int n) {

        int zeroCntOfBinaryN = Integer.bitCount(n);
        int num = n + 1;
        while (Integer.bitCount(num) != zeroCntOfBinaryN) {
            num++;
        }

        return num;
    }

}
