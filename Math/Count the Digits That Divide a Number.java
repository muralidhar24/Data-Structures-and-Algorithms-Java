// Problem: Count the Digits That Divide a Number
// Platform: LeetCode
// Difficulty: Easy
// Approach: Extract each digit and check whether it divides the original number
// Time Complexity: O(d)   // d = number of digits
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int countDigits(int num) {

        int temp = num;
        int count = 0;

        while (temp > 0) {

            int digit = temp % 10;

            if (num % digit == 0)
                count++;

            temp = temp / 10;
        }

        return count;
    }
}