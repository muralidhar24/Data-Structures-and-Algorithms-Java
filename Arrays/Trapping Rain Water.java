
// Problem: Trapping Rain Water
// Platform: LeetCode
// Difficulty: Hard
// Approach: Prefix Maximum + Suffix Maximum
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: No ❌

class Solution {
    public int trap(int[] height) {

        int size = height.length;

        if (size < 2) return 0;

        int leftHeight = Integer.MIN_VALUE;
        int count = 0;

        int rightMaxHeight[] = new int[size];

        rightMaxHeight[size - 1] = height[size - 1];

        for (int i = size - 2; i >= 0; i--) {
            rightMaxHeight[i] =
                Math.max(height[i], rightMaxHeight[i + 1]);
        }

        for (int i = 0; i < height.length - 1; i++) {

            leftHeight = Math.max(height[i], leftHeight);

            int temp =
                Math.min(leftHeight, rightMaxHeight[i + 1])
                - height[i];

            count += temp >= 0 ? temp : 0;
        }

        return count;
    }
}