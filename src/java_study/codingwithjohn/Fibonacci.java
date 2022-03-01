package java_study.codingwithjohn;

public class Fibonacci {

    private static long[] fibonacciCache;
    public static void main(String[] args) {

        int n = 100;

        fibonacciCache = new long[n + 1];

        for(int i = 0; i <= n; i++ ) {
            System.out.println(fibonacci(i));
        }
//        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n ) {
        if (n <= 1) return n;

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = fibonacci(n-1) + fibonacci(n-2);
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
