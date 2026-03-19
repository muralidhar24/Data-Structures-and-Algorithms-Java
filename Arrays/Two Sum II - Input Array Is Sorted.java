
// Problem: Two Sum II - Input Array Is Sorted
// Platform: LeetCode
// Difficulty: Medium
// Approach: Two Pointer (Shrink window based on sum comparison)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {

            if(numbers[left] + numbers[right] > target) 
                right--;

            else if(numbers[left] + numbers[right] < target)
                left++;

            else if(numbers[left] + numbers[right] == target) 
                break;

        }

        return new int[]{left + 1, right + 1};
    }
}