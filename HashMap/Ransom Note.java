
// Problem: Ransom Note
// Platform: LeetCode
// Difficulty: Easy
// Approach: Frequency Count using HashMap (build from magazine, consume for ransomNote)
// Time Complexity: O(n + m)
// Space Complexity: O(n)

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : ransomNote.toCharArray()) {
            
            if (map.containsKey(ch) && map.get(ch) != 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}