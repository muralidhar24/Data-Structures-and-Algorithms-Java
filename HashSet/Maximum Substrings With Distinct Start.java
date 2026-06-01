
// Problem: Maximum Distinct Characters in a String
// Platform: Custom
// Difficulty: Easy
// Approach: HashSet to store unique characters
// Time Complexity: O(n)
// Space Complexity: O(1)   // at most 26/128 characters depending on charset
// Optimal: Yes ✅ (best and simplest approach)

class Solution {
    public int maxDistinct(String s) {
        
        HashSet<Character> frequency = new HashSet<>();

        for (char value : s.toCharArray()) {
            
            if (frequency.contains(value)) continue;

            frequency.add(value);
        }

        return frequency.size();
    }
}