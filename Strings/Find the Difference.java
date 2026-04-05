
// Problem: Find the Difference
// Platform: LeetCode
// Difficulty: Easy
// Approach: Sorting and comparing both strings
// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Optimal: ❌ Not optimal (can be solved in O(n) time and O(1) space using XOR)

import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int index = 0; index < ch1.length; index++) {
            if (ch1[index] != ch2[index])
                return ch2[index];
        }

        return ch2[ch1.length];
    }
}