
// Problem: Count Digit Occurrences in an Array
// Platform: Custom
// Difficulty: Easy
// Approach: Extract digits of each number and count matches
// Time Complexity: O(n × d)   // d = number of digits
// Space Complexity: O(1)
// Optimal: Yes ✅ (single traversal with digit manipulation)

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        
        int count = 0;

        for (int num : nums) {

            int temp = num;

            while (temp > 0) {

                if (temp % 10 == digit)
                    count++;

                temp = temp / 10;
            }
        }

        return count;
    }
}