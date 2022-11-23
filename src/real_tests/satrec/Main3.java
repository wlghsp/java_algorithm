package real_tests.satrec;

public class Main3 {


    public static void main(String[] args) {
        System.out.println(computeCheckDigit("39847"));
    }

    public static int computeCheckDigit(String idNumber) {
        int result = 0;
        int oddSum = 0;
        for (int i = 0; i < idNumber.length(); i++) {
            if (i % 2 == 0) {
                char c = idNumber.charAt(i);
                result += c - 48;
            } else {
                char c = idNumber.charAt(i);
                oddSum += c - 48;
            }
        }
        result = result * 3;
        result += oddSum;
        String tmp = String.valueOf(result);
        result = tmp.charAt(tmp.length() - 1) - 48;
        if (result != 0) {
            result = 10 - result;
        }
        return result;
    }
}
