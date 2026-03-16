
// Problem: Longest Palindromic Substring
// Platform: LeetCode
// Difficulty: Medium
// Approach: Brute Force (Generate all substrings + Palindrome Check)
// Time Complexity: O(n³)
// Space Complexity: O(1)

class Solution {

    public static boolean checkPalindrome(String str)
    {
        int left = 0; 
        int right = str.length()-1;
        while(left < right)
        {
            if(str.charAt(left) == str.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String result = "";
        for(int i=0; i<s.length(); i++)
        {
            for(int j=i; j<s.length(); j++)
            {
                if(result.length() < s.substring(i, j+1).length() && checkPalindrome( s.substring(i, j+1)))
                {
                    result = s.substring(i, j+1);
                }
            }
        }
        return result;
    }
}