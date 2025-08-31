import java.util.*;

public class Main {
    // Euclidean algorithm for GCD
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static long lcm(long a, long b) {
        long g = gcd(a, b);
        // divide first to avoid overflow; fits in long since a,b ≤ 1e9
        return (a / g) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        System.out.println(lcm(N, M));
    }
}
