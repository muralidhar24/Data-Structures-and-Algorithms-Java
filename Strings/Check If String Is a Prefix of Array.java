
// Problem: Check If String Is a Prefix of Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Concatenate words one by one and check whether the built string equals s
// Time Complexity: O(n + |s|)
// Space Complexity: O(|s|)
// Optimal: ⚠️ Accepted, but can be improved

class Solution {
    public boolean isPrefixString(String s, String[] words) {

        StringBuffer name = new StringBuffer();

        for (String str : words) {

            name.append(str);

            if (name.toString().equals(s))
                return true;
        }

        return false;
    }
}