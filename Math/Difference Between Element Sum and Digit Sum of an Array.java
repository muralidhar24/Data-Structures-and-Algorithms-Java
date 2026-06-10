
// Problem: Difference Between Element Sum and Digit Sum of an Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Compute element sum and digit sum in a single traversal
// Time Complexity: O(n × d)   // d = number of digits
// Space Complexity: O(1)
// Optimal: Yes ✅ (expected solution)

class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum = 0;
        int digitSum = 0;

        for (int num : nums) {

            sum = sum + num;

            int temp = num;

            while (temp > 0) {

                digitSum = digitSum + (temp % 10);

                temp = temp / 10;
            }
        }

        return Math.abs(sum - digitSum);
    }
}