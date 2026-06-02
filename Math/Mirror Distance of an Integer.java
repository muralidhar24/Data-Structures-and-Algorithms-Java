
// Problem: Mirror Distance of a Number
// Platform: Custom
// Difficulty: Easy
// Approach: Reverse the number mathematically and compute absolute difference
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (efficient mathematical approach)

class Solution {
    public int mirrorDistance(int n) {
        
        int temp = n;
        int reverse = 0;

        for (int i = 1; i <= String.valueOf(n).length(); i++) {

            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }

        return Math.abs(n - reverse);
    }
}