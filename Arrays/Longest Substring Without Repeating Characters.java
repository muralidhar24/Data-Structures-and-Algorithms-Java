
// Problem: Longest Substring Without Repeating Characters
// Platform: LeetCode
// Difficulty: Medium
// Approach: HashMap + Sliding Window (Resetting Window)
// Time Complexity: O(n²)  (due to substring creation and window reset)
// Space Complexity: O(n)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Character, Integer> temp = new HashMap<>();

        int left = 0;
        int right = 0;
        int result = 0;

        while (right < s.length()) {
            if (temp.containsKey(s.charAt(right))) {
                map.put(s.substring(left, right), s.substring(left, right).length());
                left = temp.get(s.charAt(right)) + 1;
                right = left;
                temp.clear();
                temp.put(s.charAt(right), right);
            } else if (right == s.length() - 1 && !(map.containsKey(s.substring(left, right + 1)))) {
                map.put(s.substring(left, right + 1), s.substring(left, right + 1).length());
            } else {
                temp.put(s.charAt(right), right);
            }
            right++;
        }
        for (int n : map.values()) {
            if (result < n) {
                result = n;
            }
        }
        return result;
    }
}