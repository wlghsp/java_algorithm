package real_tests.kkne_250506;

import java.util.Arrays;

public class Kkne2 {

    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int score = 0;
        int a = 0, b = 0;

        while (a < A.length && b < B.length) {
            if (B[b] > A[a]) {
                score++;
                a++;
                b++;
            } else {
                b++;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        Kkne2 k = new Kkne2();
        int result = k.solution(new int[]{5, 1, 3, 7}, new int[]{2, 2, 6, 8});
        System.out.println(result);
    }
}
