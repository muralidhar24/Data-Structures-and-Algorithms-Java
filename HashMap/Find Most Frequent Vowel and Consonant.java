
// Problem: Maximum Frequency Sum of Vowels and Consonants
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashMap frequency counting + track max vowel and consonant frequency
// Time Complexity: O(n)
// Space Complexity: O(1)   // at most 26 lowercase letters
// Optimal: Yes ✅ (efficient single frequency mapping approach)

class Solution {
    public int maxFreqSum(String s) {
        
        HashMap<Character, Integer> mapping = new HashMap<>();

        int vowelCount = 0;
        int consonentCount = 0;

        for(char ch : s.toCharArray()) mapping.put(ch, mapping.getOrDefault(ch, 0) + 1);
    
        for(Map.Entry<Character, Integer> pair : mapping.entrySet()) {

            if("aeiou".indexOf(pair.getKey()) != -1 ) vowelCount = Math.max(vowelCount, pair.getValue());

            else consonentCount = Math.max(consonentCount, pair.getValue());
        }

        return vowelCount + consonentCount;

    }
}