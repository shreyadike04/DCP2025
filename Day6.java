import java.util.*;

public class ZeroSumSubarraysSimple {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];

                if (sum == 0) {
                    result.add(new int[]{start, end});
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        List<int[]> subarrays = findZeroSumSubarrays(arr);

        for (int[] range : subarrays) {
            System.out.println("(" + range[0] + ", " + range[1] + ")");
        }
    }
}
