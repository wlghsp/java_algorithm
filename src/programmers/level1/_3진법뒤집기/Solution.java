package programmers.level1._3진법뒤집기;

public class Solution {

    public String convertToTrinary1(int n, String result) {
        if (n == 0) {
            return result.isEmpty() ? "0" : result;
        }
        return convertToTrinary1(n / 3, (n % 3) + result);
    }

    public String convertToTrinary(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.insert(0, (n % 3));
            n /= 3;
        }
        return result.toString();
    }
    public int convertToDecimal(String str) {
        int n = 3;
        int len = str.length();
        String[] strArr = str.split("");

        int result = 0;
        int multi = 1;

        for (int i = len - 1; i >= 0; i--) {
            result += Integer.parseInt(strArr[i]) * multi;
            multi *= n;
        }

        return result;
    }

    public int solution(int n) {
        String str = new StringBuilder(convertToTrinary(n)).reverse().toString();
        return convertToDecimal(str);
    }
}
