
// Problem: Is Subsequence
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointer (scan t and match characters of s)
// Time Complexity: O(n)   // n = length of t
// Space Complexity: O(1)

class Solution {
    public boolean isSubsequence(String s, String t) {

        int left = 0;

        if(s.length() == 0)
            return true;

        for(int i=0; i<t.length(); i++) {

            if(s.charAt(left) == t.charAt(i))
                left++;

            if(left == s.length())
                return true;
        }

        return false;
    }
}