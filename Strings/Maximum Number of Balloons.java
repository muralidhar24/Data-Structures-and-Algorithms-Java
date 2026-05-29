
// Problem: Maximum Number of Balloons
// Platform: LeetCode
// Difficulty: Easy
// Approach: Frequency counting and repeatedly forming "balloon"
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: ❌ Not fully optimal (can directly compute minimum frequency without loop simulation)


class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int[] charFrequency = new int[26];

        int count = 0;

        for(char ch : text.toCharArray()) charFrequency[ch - 'a'] += 1;

        for(int i = 1, size = text.length() / 7; i <= size; i++) {

            if(charFrequency['b' - 'a'] > 0 && charFrequency['o' - 'a'] > 1 && charFrequency['a' - 'a'] > 0 && charFrequency['l' - 'a'] > 1 && charFrequency['n' - 'a'] > 0) {
                charFrequency['b' - 'a'] -= 1;
                charFrequency['o' - 'a'] -= 2;
                charFrequency['a' - 'a'] -= 1;
                charFrequency['l' - 'a'] -= 2;
                charFrequency['n' - 'a'] -= 1;
                count++;
            } else { break; }

        }

        return count;

    }
}