
// Problem: Maximum Number of Balloons
// Platform: LeetCode
// Difficulty: Easy
// Approach: Count character frequencies and repeatedly form the word "balloon"
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: ⚠️ Accepted, but not the most optimal implementation

class Solution {
    public int maxNumberOfBalloons(String text) {

        int arr[] = new int[26];
        int count = 0;

        for (char ch : text.toCharArray())
            arr[ch - 'a']++;

        while (arr['b' - 'a'] > 0 &&
               arr['a' - 'a'] > 0 &&
               arr['l' - 'a'] > 1 &&
               arr['o' - 'a'] > 1 &&
               arr['n' - 'a'] > 0) {

            count++;

            arr['b' - 'a']--;
            arr['a' - 'a']--;
            arr['l' - 'a'] -= 2;
            arr['o' - 'a'] -= 2;
            arr['n' - 'a']--;
        }

        return count;
    }
}