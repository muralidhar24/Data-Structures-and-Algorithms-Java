
// Problem: Kth Distinct String in an Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Count frequencies, then traverse the original array to find the kth distinct string
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (expected HashMap solution)

class Solution {
    public String kthDistinct(String[] arr, int k) {

        int count = 0;

        HashMap<String, Integer> map = new HashMap<>();

        for (String name : arr)
            map.put(name, map.getOrDefault(name, 0) + 1);

        for (String name : arr) {

            if (map.get(name) == 1) {

                count++;

                if (count == k)
                    return name;
            }
        }

        return "";
    }
}