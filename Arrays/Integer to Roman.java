
// Problem: Integer to Roman
// Platform: LeetCode
// Difficulty: Medium
// Approach: Greedily subtract the largest Roman value that does not exceed
// the remaining number, appending the corresponding symbol each time.
// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public String intToRoman(int num) {

        int[] nums = {
            1000,
            900, 500, 400, 100,
            90, 50, 40, 10,
            9, 5, 4, 1
        };

        String[] symbols = {
            "M",
            "CM", "D", "CD", "C",
            "XC", "L", "XL", "X",
            "IX", "V", "IV", "I",
        };

        StringBuilder result = new StringBuilder();

        int index = 0;

        while (num > 0) {

            if (num >= nums[index]) {

                result.append(symbols[index]);
                num -= nums[index];

            } else {

                index++;
            }
        }

        return result.toString();
    }
}