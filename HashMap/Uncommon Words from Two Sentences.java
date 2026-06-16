
// Problem: Uncommon Words from Two Sentences
// Platform: LeetCode
// Difficulty: Easy
// Approach: Count frequencies of all words from both sentences and collect words appearing exactly once
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)
// Optimal: Yes ✅ (expected HashMap frequency-counting solution)

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String name : s1.split(" "))
            map.put(name, map.getOrDefault(name, 0) + 1);

        for (String name : s2.split(" "))
            map.put(name, map.getOrDefault(name, 0) + 1);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]);
    }
}