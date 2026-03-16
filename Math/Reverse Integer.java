
// Problem: Reverse Integer
// Platform: LeetCode
// Difficulty: Medium
// Approach: Mathematical Digit Extraction
// Time Complexity: O(log10 n)
// Space Complexity: O(1)

class Solution {
    public int reverse(int x) {
        int result = 0;
        int temp = 0;
        while(x!=0)
        {
            result = result*10 + x%10;
            temp = x;
            x = x/10;
        }
        
        if(temp == result%10)
        	   return result;
        else
        	   return 0;
    }
}