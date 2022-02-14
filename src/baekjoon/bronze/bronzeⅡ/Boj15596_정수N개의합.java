package baekjoon.bronze.bronzeⅡ;

public class Boj15596_정수N개의합 {

    long sum(int[] a) {
        long result = 0;

        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
