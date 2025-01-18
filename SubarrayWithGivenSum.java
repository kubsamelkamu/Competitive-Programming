import java.util.*;

public class SubarrayWithGivenSum {
    public static List<Integer> findSubarrayWithSum(int[] arr, int target) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == target) {
                return Arrays.asList(1, i + 1);
            }

            if (prefixSumMap.containsKey(currentSum - target)) {
                return Arrays.asList(prefixSumMap.get(currentSum - target) + 2, i + 1);
            }
            prefixSumMap.put(currentSum, i);
        }
        return Collections.singletonList(-1);
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 7, 5};
        int target1 = 12;
        System.out.println(findSubarrayWithSum(arr1, target1)); // Output: [2, 4]

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target2 = 15;
        System.out.println(findSubarrayWithSum(arr2, target2)); // Output: [1, 5]

        int[] arr3 = {5, 3, 4};
        int target3 = 2;
        System.out.println(findSubarrayWithSum(arr3, target3)); // Output: [-1]
    }
}
