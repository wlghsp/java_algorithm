package leetcode;

import java.util.Arrays;

public class Leetcode88_MergeSortedArray {

    /*
    배열의 뒤부터 비교해가며 넣어준다.

    i 또는 j가 0이 되고 나면 나머지 하나가 0이 될때까지 배열을 채워주어야 한다.
    i는 이미 배열에 채워져 있기 때문에  j가 0이 될때까지만 값을 넣어준다.

     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) nums1[index--] = nums2[j--];
            else nums1[index--] = nums1[i--];
        }

        while (j >= 0) nums1[index--] = nums2[j--];
    }


    public static void main(String[] args) {
        Leetcode88_MergeSortedArray T = new Leetcode88_MergeSortedArray();
        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2,5,6};
        int n = 3;
        T.merge(num1, m, num2, n);
    }
}
