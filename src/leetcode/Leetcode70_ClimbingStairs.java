package leetcode;

public class Leetcode70_ClimbingStairs {

    // 계차수열


    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 2;
        if (n < 3) return arr[n - 1];
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        Leetcode70_ClimbingStairs T = new Leetcode70_ClimbingStairs();

        int n = 2;
        int n1 = 3;
        int n2 = 4;

        System.out.println(T.climbStairs(n)); // 2
        System.out.println(T.climbStairs(n1)); // 3
        System.out.println(T.climbStairs(n2)); // 5

    }
}
