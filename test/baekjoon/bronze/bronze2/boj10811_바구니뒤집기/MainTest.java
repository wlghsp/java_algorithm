package baekjoon.bronze.bronze2.boj10811_바구니뒤집기;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MainTest {


    @Test
    void test() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Main.reverse(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
}