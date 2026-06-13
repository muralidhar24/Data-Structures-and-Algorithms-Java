
// Problem: Excel Sheet Column Number
// Platform: LeetCode
// Difficulty: Easy
// Approach: Base-26 conversion from Excel column title to number
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (correct base conversion approach)

class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result = 0;

        for (int index = 0, size = columnTitle.length(); index < size; index++) {

            result = result +
                    ((int) Math.pow(26, index) *
                    (columnTitle.charAt(size - 1 - index) - 'A' + 1));
        }

        return result;
    }
}