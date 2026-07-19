
// Problem: GCD Sum
// Platform: LeetCode / Contest
// Difficulty: Unknown
// Category: Math, GCD, Prefix Array, Sorting
// Pattern: Euclidean Algorithm (Attempted), Prefix Processing
// Approach: Compute GCD values, sort them, and sum the GCD of pairs from both ends.
// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Optimal: ❌ No (Logic is incorrect)

class Solution {

    public static int gcdCalc(int dividend, int divisor) {

        while (dividend % divisor != 0) {

            int temp = dividend % divisor;
            dividend = divisor;
            divisor = temp;

        }

        return divisor;
    }

    public long gcdSum(int[] nums) {

        ArrayList<Integer> prefixGcd = new ArrayList<>();

        int max = 0;

        for (int index = 0, size = nums.length; index < size; index++) {

            max = Math.max(max, nums[index]);

            prefixGcd.add(gcdCalc(max, nums[index]));

        }

        Collections.sort(prefixGcd);

        int left = 0;
        int right = prefixGcd.size() - 1;
        long result = 0;

        while (left < right) {

            result = result + gcdCalc(prefixGcd.get(right), prefixGcd.get(left));
            left++;
            right--;
        }

        return result;

    }
}