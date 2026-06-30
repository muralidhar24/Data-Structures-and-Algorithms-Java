
// Problem: Check If Two String Arrays are Equivalent
// Platform: LeetCode
// Difficulty: Easy
// Approach: Concatenate both string arrays using StringBuilder and compare the results
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)
// Optimal: ⚠️ Accepted, but not the most space-efficient solution

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");

        for (String name : word1)
            str1.append(name);

        for (String name : word2)
            str2.append(name);

        return str1.toString().equals(str2.toString());
    }
}