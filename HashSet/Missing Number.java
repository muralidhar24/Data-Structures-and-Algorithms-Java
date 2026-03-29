
// Problem: Missing Number
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashSet to track elements and find missing
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> m = new HashSet<Integer>();
        int count = 0;
        for(int num : nums) {
            m.add(num);
        }
        for(int i=0; i<nums.length+1; i++) {
            if(!m.contains(count)) {
                break;
            }
            else{
                count++;
            }
        }
        return count;

    }
}