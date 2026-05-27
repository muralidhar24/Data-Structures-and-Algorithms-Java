
// Problem: Final Value of Variable After Performing Operations
// Platform: LeetCode
// Difficulty: Easy
// Approach: Iterate and update counter based on operation type
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (simple and efficient)

class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int X = 0;

        for (String str : operations) {

            if (str.equals("X++") || str.equals("++X")) 
                X++;
            else if (str.equals("X--") || str.equals("--X")) 
                X--;
        }

        return X;
    }
}