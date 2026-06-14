
// Problem: Perfect Number
// Platform: LeetCode
// Difficulty: Easy
// Approach: Sum all proper divisors and compare with the number
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: ❌ Not optimal
// Expected: Check divisors only up to √n

class Solution {
    public boolean checkPerfectNumber(int num) {
        
        int result = 0;

        for (int index = 1; index <= num / 2; index++) {

            if (num % index == 0)
                result += index;
        }

        return result == num;
    }
}