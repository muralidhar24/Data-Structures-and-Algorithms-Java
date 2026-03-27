
// Problem: Find the Index of the First Occurrence in a String (strStr)
// Platform: LeetCode
// Difficulty: Easy
// Approach: Sliding Window using Substring Comparison
// Time Complexity: O(n * m)   // n = length of haystack, m = length of needle
// Space Complexity: O(m)      // due to substring creation

class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=needle.length();
        int result;
        if(haystack.length() >= needle.length())
        {
            while(true)
            {
                if(haystack.substring(i,j).equals(needle))
                {
                    result = i;
                    break;
                }
                else if(j!=haystack.length())
                {
                    i++;
                    j++;
                }
                else
                {
                    result = -1;
                    break;
                }
            }
        }
        else
        {
            result = -1;
        }
        return result;
    }
}