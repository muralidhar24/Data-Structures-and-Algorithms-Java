
// Problem: Reverse Words in a String
// Platform: LeetCode
// Difficulty: Medium
// Approach: Split + Reverse traversal using StringBuilder
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (clean and commonly accepted approach)

class Solution {
    public String reverseWords(String s) {

        String[] result = s.trim().split("\\s+");

        StringBuilder str = new StringBuilder();

        for(int i=result.length - 1; i>=0; i--) {
            str.append(result[i]).append(" ");
        }

        return str.toString().trim();
    }
}