
// Problem: Count Common Words With One Occurrence
// Platform: LeetCode
// Difficulty: Easy
// Approach: Count frequencies in both arrays and count words appearing exactly once in each
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)
// Optimal: Yes ✅ (expected HashMap frequency-counting solution)

class Solution {
    public int countWords(String[] words1, String[] words2) {

        int count = 0;

        HashMap<String, Integer> str1 = new HashMap<>();
        HashMap<String, Integer> str2 = new HashMap<>();

        for (String name : words1)
            str1.put(name, str1.getOrDefault(name, 0) + 1);

        for (String name : words2)
            str2.put(name, str2.getOrDefault(name, 0) + 1);

        for (Map.Entry<String, Integer> entry : str1.entrySet())

            if (entry.getValue() == 1 &&
                str2.getOrDefault(entry.getKey(), 0) == 1)

                count++;

        return count;
    }
}