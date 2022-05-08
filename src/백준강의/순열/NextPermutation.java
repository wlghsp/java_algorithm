package 백준강의.순열;

import java.util.Scanner;

public class NextPermutation {

    static boolean next_permutation(int[] a){
        int i = a.length - 1;
        while (i > 0 && a[i-1] >= a[i]) i -= 1;

        if (i <= 0) return false;  // 마지막 순열


        int j = a.length - 1;
        while (a[j] <= a[i-1]) j -= 1;

//        swap(a[i-1], a[j]);
        int temp = a[i-1];
        a[i-1] = a[i];
        a[i] = temp;


        j = a.length - 1;
        while (i < j) {
            temp = a[i];
            a[j] = a[i];
            a[i] = temp;
            i += 1; j -= 1;
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


    }
}
