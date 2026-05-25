
// Problem: First Unique Character in a String
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashMap to count frequency, then second pass to find first unique
// Time Complexity: O(n)
// Space Complexity: O(1)   // at most 26 lowercase letters
// Optimal: Yes ✅ (standard and efficient approach)


class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char letter : s.toCharArray())
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);

        for (int index = 0, size = s.length(); index < size; index++) {

            char letter = s.charAt(index);
            if (letterCount.get(letter) == 1)
                return index;
        }

        return -1;
    }
}