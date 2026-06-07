
// Problem: Digit Frequency Score
// Platform: Custom
// Difficulty: Easy
// Approach: Count digit frequencies using HashMap and compute weighted sum
// Time Complexity: O(d)   // d = number of digits
// Space Complexity: O(1)  // at most 10 distinct digits (0–9)
// Optimal: Yes ✅ (efficient single-pass counting approach)

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int digitFrequencyScore(int n) {
        
        int result = 0;
        int temp = n;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int index = 1; index <= String.valueOf(n).length(); index++) {

            int value = temp % 10;

            map.put(value, map.getOrDefault(value, 0) + 1);

            temp = temp / 10;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result = result + (entry.getValue() * entry.getKey());
        }

        return result;
    }
}