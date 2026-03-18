
// Problem: Remove Duplicates from Sorted Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashSet + ArrayList (Extra Space)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int removeDuplicates(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new  HashSet<>();

        for(int i=0; i<nums.length; i++) {

            if(!(set.contains(nums[i]))) {
                list.add(nums[i]);
                set.add(nums[i]);
            }
        }
        
        for(int i=0; i<list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}