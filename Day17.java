import java.util.*;

public class PrimeFactorization {
    public static List<Integer> primeFactors(long n) {
        List<Integer> factors = new ArrayList<>();
        // Factor out 2s
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        // Factor out odd numbers
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add((int)i);
                n /= i;
            }
        }
        // If remainder > 1, it's prime
        if (n > 1) factors.add((int)n);
        return factors;
    }

    // Demo
    public static void main(String[] args) {
        long N = 18; // Example input
        System.out.println(primeFactors(N)); // Output: [2, 3, 3]
    }
}
