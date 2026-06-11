
// Problem: Find Closest Person
// Platform: LeetCode
// Difficulty: Easy
// Approach: Compare absolute distances from x and y to z
// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimal: Yes ✅ (direct mathematical comparison)

class Solution {
    public int findClosest(int x, int y, int z) {

        if (Math.abs(x - z) < Math.abs(y - z))
            return 1;

        else if (Math.abs(x - z) > Math.abs(y - z))
            return 2;

        return 0;
    }
}