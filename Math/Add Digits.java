
// Problem: Add Digits
// Platform: LeetCode
// Difficulty: Easy
// Approach: Repeatedly sum the digits until a single-digit number remains
// Time Complexity: O(d × k)
//   d = number of digits
//   k = number of iterations until a single digit
// Space Complexity: O(1)
// Optimal: ⚠️ Accepted, but not the mathematical optimal solution

class Solution {
    public int addDigits(int num) {

        while (num > 9) {

            int temp = num;
            int sum = 0;

            while (temp > 0) {

                sum = sum + temp % 10;
                temp = temp / 10;
            }

            num = sum;
        }

        return num;
    }
}