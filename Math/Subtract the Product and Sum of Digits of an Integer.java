
// Problem: Subtract the Product and Sum of Digits of an Integer
// Platform: LeetCode
// Difficulty: Easy
// Approach: Extract digits, compute product and sum simultaneously
// Time Complexity: O(d)   // d = number of digits
// Space Complexity: O(1)
// Optimal: Yes ✅ (single pass through the digits)

class Solution {
    public int subtractProductAndSum(int n) {
        
        int product = 1;
        int sum = 0;
        int temp = n;

        while (temp > 0) {

            sum = sum + (temp % 10);
            product = product * (temp % 10);

            temp = temp / 10;
        }

        return product - sum;
    }
}