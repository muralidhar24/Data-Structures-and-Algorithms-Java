
// Problem: First Unique Even Number
// Platform: Custom
// Difficulty: Easy
// Approach: Frequency array for even numbers, then second pass to find first unique even
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (efficient counting approach)

class Solution {
    public int firstUniqueEven(int[] nums) {
        
        int[] arr = new int[51];
        int size = nums.length;

        for(int i = 0; i < size; i++) {
            
            int number = nums[i];

            if(number % 2 == 0) {
                arr[(number / 2)] +=1;
            }
        }

        for(int i = 0; i < size ; i++) {

            int number = nums[i];

            if(arr[number / 2] == 1 && number % 2 == 0) return number;
        }

        return -1;
    }
}