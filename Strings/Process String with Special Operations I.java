
// Problem: Process String with Special Operations I
// Platform: LeetCode
// Difficulty: Easy
// Approach: Simulate each operation using a StringBuilder
// Time Complexity: O(n + total_generated_string_length)
// Space Complexity: O(result_length)
// Optimal: ✅ Yes (simulation is the intended approach)

class Solution {
    public String processStr(String s) {

        StringBuilder name = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {

                name.append(ch);

            } else if (name.length() > 0 && ch == '*') {

                name.deleteCharAt(name.length() - 1);

            } else if (ch == '#') {

                name.append(name);

            } else if (ch == '%') {

                name.reverse();
            }
        }

        return name.toString();
    }
}