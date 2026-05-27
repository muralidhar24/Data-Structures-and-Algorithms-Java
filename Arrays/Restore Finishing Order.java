
// Problem: Restore Finishing Order
// Platform: Custom
// Difficulty: Easy
// Approach: HashSet for fast lookup and preserve order using traversal
// Time Complexity: O(n + m)
// Space Complexity: O(m)
// Optimal: Yes ✅ (efficient lookup with order preservation)

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        HashSet<Integer> map = new HashSet<>();

        int[] result = new int[friends.length];

        for (int number : friends) {
            if (!map.contains(number))
                map.add(number);
        }

        int i = 0;

        for (int num : order) {

            if (map.contains(num)) {
                result[i] = num;
                i++;
            }
        }

        return result;
    }
}