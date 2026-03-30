
// Problem: Length of Last Word
// Platform: LeetCode
// Difficulty: Easy
// Approach: String Traversal from End after Trimming Spaces
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String str = s.trim();
        int left = str.length()-1;

        if(str.length() == 1)
            return 1;

        while(left >= 0 && str.charAt(left) != ' ') {
            count++;
            left--;
        }
        return count;
    }
}