package real_tests.line_plus_220924;

public class PowTest {

    public static void main(String[] args) {
        int n = 10;

        double i = 0;

        double tmp = 0;
        while (true) {
            tmp = Math.pow(2, i);
            if (tmp >= n) {
                break;
            }
            i++;
        }

        System.out.println(tmp);
    }
}
