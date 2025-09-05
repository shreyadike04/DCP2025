import java.util.*;

public class FirstElementKTimes {
    public static int firstElementKTimes(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find first element that appears exactly k times
        for (int num : arr) {
            if (freq.get(num) == k) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k = 2;
        System.out.println(firstElementKTimes(arr, k)); // Output: 1
    }
}
