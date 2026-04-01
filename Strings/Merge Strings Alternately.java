
// Problem: Merge Strings Alternately
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointer with StringBuilder
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0;
        int right = 0;
        StringBuilder str = new StringBuilder("");
        while(left <word1.length() || right < word2.length())
        {
            if(left < word1.length())
            {
                str.append( word1.charAt(left));
                left++;
            }
            if(right < word2.length())
            {
                str.append(word2.charAt(right));
                right++;
            }
        }
        return str.toString();
    }
}