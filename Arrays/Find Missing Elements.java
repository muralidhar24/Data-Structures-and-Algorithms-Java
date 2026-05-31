
// Problem: Find Missing Elements in Range
// Platform: Custom
// Difficulty: Easy
// Approach: HashSet for lookup and iterate from min to max
// Time Complexity: O(n + range)
// Space Complexity: O(n)
// Optimal: Yes ✅ (efficient and straightforward approach)


class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        List<Integer> result = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : nums) {

            min = Math.min(min, value);
            max = Math.max(max, value);

            if (!set.contains(value))
                set.add(value);
        }

        for (int index = min; index <= max; index++)
            if (!set.contains(index))
                result.add(index);

        return result;
    }
}