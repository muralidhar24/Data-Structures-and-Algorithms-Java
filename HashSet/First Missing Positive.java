
// Problem: First Missing Positive
// Platform: LeetCode
// Difficulty: Hard
// Approach: HashSet to track presence of elements
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> m = new HashSet<>();
        int count =1;
        for(int i=0; i<nums.length; i++)
        {
            m.add(nums[i]);
        }
        while(true)
        {
            if(!m.contains(count))
            {
                break;
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}