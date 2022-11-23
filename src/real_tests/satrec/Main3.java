package real_tests.satrec;

public class Main3 {


    public static void main(String[] args) {
        System.out.println(computeCheckDigit("39847"));
    }

    public static int computeCheckDigit(String idNumber) {
        int result = 0;
        int oddSum = 0;
        for (int i = 0; i < idNumber.length(); i++) {
            char c = idNumber.charAt(i);
            if (i % 2 == 0) {
                result += c - 48;
            } else {
                oddSum += c - 48;
            }
        }
        result *= 3;
        result += oddSum;

        // 일의 자릿수 구하기
//        String tmp = String.valueOf(result);
//        result = tmp.charAt(tmp.length() - 1) - 48;

        // 이게 더 효율적
        result = result % 10;

        if (result != 0) {
            result = 10 - result;
        }
        return result;
    }
}
