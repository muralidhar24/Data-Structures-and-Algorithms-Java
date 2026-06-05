
// Problem: Total Waviness in a Range
// Platform: LeetCode
// Difficulty: Medium
// Approach: Iterate through each number, examine adjacent digits, and count local peaks/valleys
// Time Complexity: O((num2 - num1 + 1) * d)   // d = number of digits
// Space Complexity: O(d)                       // char array for each number
// Optimal: ⚠️ Reasonable for small ranges, but not optimal for very large ranges

class Solution {
    public int totalWaviness(int num1, int num2) {
        
        int result = 0;

        for (int index = num1; index <= num2; index++) {

            char ch[] = String.valueOf(index).toCharArray();

            for (int i = 1; i < ch.length - 1; i++) {

                int previous = Character.getNumericValue(ch[i - 1]);
                int current = Character.getNumericValue(ch[i]);
                int next = Character.getNumericValue(ch[i + 1]);

                if (previous > current && next > current ||
                    previous < current && next < current)
                    result++;
            }
        }

        return result;
    }
}