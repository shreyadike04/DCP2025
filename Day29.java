public class FibonacciDP {
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long prev1 = 1, prev2 = 0;
        long curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n)); // Output: 5
    }
}
