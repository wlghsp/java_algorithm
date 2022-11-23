package real_tests.satrec;

public class Main4 {

    public static void main(String[] args) {
        System.out.println(computeMultipleSum(11));
    }


    public static int computeMultipleSum(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                result += i;
            }
        }
        return result;
    }
}
