
// Problem: Rearrange String
// Platform: LeetCode / Contest
// Difficulty: Easy
// Approach: Count the occurrences of the two specified characters, append all other characters first, then append all occurrences of y followed by x.
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅

class Solution {
    public String rearrangeString(String s, char x, char y) {

        StringBuilder name = new StringBuilder();

        int xCount = 0;
        int yCount = 0;

        for (char ch : s.toCharArray()) {

            if (ch == x)
                xCount++;
            else if (ch == y)
                yCount++;
            else
                name.append(ch);
        }

        for (int i = yCount; i > 0; i--)
            name.append(y);

        for (int i = xCount; i > 0; i--)
            name.append(x);

        return name.toString();
    }
}