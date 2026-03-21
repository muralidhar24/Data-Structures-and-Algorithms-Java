
// Problem: Shuffle the Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointer (merge first half and second half alternately)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = n;

        for(int i=0; i<nums.length; i++) {
            if(i%2==0) {
                 arr[i] = nums[left];
                 left++;
            }
            else {
                arr[i] = nums[right];
                right++;
            }
        }
        return arr;
    }
}