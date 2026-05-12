
// Problem: Strictly Palindromic Number
// Platform: LeetCode
// Difficulty: Medium
// Approach: Convert number into every base from 2 to n-2 and check palindrome
// Time Complexity: O(n log n)
// Space Complexity: O(log n)
// Optimal: ❌ Not optimal (mathematical observation proves answer is always false for n >= 4)

class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for(int i = 2, size = n - 2; i <= size; i++) {

            StringBuilder original = new StringBuilder("");
            StringBuilder reverse = new StringBuilder("");

            int temp = n;

            do {

                int digit = temp % i;

                original.append(digit);
                reverse.insert(0, digit);

                temp = temp / i;

            } while(temp != 0);

            if(!(original.toString().equals(reverse.toString()))) return false;
        }

        return true;
    }
}