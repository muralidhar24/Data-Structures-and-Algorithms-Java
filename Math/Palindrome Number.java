
// Problem: Palindrome Number
// Platform: LeetCode
// Difficulty: Easy
// Approach: Reverse Integer Comparison
// Time Complexity: O(log10 n)
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int result = 0;
        boolean isPalindrome = false;
        if(x>=0)
        {
            while(x!=0)
            {
                result = result*10 + x%10;
                x=x/10;
            }
            if(result == n)
            isPalindrome = true;
        }
        return isPalindrome;
    }
}