
// Problem: Find Numbers with Even Number of Digits
// Platform: LeetCode
// Difficulty: Easy
// Approach: Check digit count using range conditions
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findNumbers(int[] nums) {
        
        int result = 0;

        for(int value : nums) {

            if(value >= 10 && value <= 99) {
                result++;
            } else if(value >= 1000 && value <= 9999) {
                result++;
            } else if(value == 100000) {
                result++;
            }
        }

        return result;
    }
}