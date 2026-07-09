
// Problem: Max Digit Range (Custom)
// Platform: Custom
// Difficulty: Easy
// Approach: Compute (max digit - min digit) for each number, group sums by this
// difference using a HashMap, then return the sum for the maximum difference.
// Time Complexity: O(n × d)   // d = number of digits
// Space Complexity: O(k)      // k = distinct digit differences
// Optimal: Yes ✅

class Solution {
    public int maxDigitRange(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int diff = 0;
        int result = 0;

        for (int num : nums) {

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int temp = num;

            while (temp > 0) {

                max = Math.max(max, temp % 10);
                min = Math.min(min, temp % 10);

                temp = temp / 10;
            }

            if (map.containsKey(max - min))
                map.put(max - min, map.get(max - min) + num);
            else
                map.put(max - min, num);

            diff = Math.max(diff, max - min);
        }

        return map.get(diff);
    }
}