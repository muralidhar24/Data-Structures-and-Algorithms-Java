
// Problem: Sequential Digits
// Platform: LeetCode
// Difficulty: Medium
// Approach: Generate every sequential number using the string "123456789"
// and keep only those within the given range.
// Time Complexity: O(1)
// Space Complexity: O(1) (excluding the output list)
// Optimal: Yes ✅

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> result = new ArrayList<>();

        String value = "123456789";

        for (int length = String.valueOf(low).length(); length <= String.valueOf(high).length(); length++) {

            int end = length;

            for (int start = 0;start < value.length() && end <= value.length(); start++) {

                int num = Integer.parseInt(value.substring(start, end));

                if (num >= low && num <= high)
                    result.add(num);

                end++;
            }
        }

        return result;
    }
}