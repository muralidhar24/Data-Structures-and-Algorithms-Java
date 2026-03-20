
// Problem: Count Commas in a Number
// Platform: Custom
// Difficulty: Easy
// Approach: Iterative check (incorrect logic – counts numbers instead of commas)
// Time Complexity: O(n)   // due to loop from 1000 to n
// Space Complexity: O(1)

class Solution {
    public int countCommas(int n) {

        int count = 0;

        if(String.valueOf(n).length() >= 4 && String.valueOf(n).length() <= 6)
            for(int i = 1000; i<=n; i++)
                count++;
            
        if(String.valueOf(n).length() == 100000)
            count = 2;
        
        return count;
    }
}