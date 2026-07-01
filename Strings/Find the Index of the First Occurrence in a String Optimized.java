
// Problem: Find the Index of the First Occurrence in a String
// Platform: LeetCode
// Difficulty: Easy
// Approach: Use Java's built-in indexOf() method
// Time Complexity: O(n × m) (implementation-dependent)
// Space Complexity: O(1)
// Optimal: ⚠️ Accepted, but not the intended interview solution

class Solution {
    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
}