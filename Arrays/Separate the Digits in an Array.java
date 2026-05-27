
// Problem: Separate the Digits in an Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Convert numbers to strings and extract digits into ArrayList
// Time Complexity: O(n * d)   // d = number of digits
// Space Complexity: O(n * d)
// Optimal: ❌ Not fully optimal (uses insert at index 0 which is costly in ArrayList)

class Solution {
    public int[] separateDigits(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int size = nums.length, i = size - 1; i >= 0; i--) {

            String number = String.valueOf(nums[i]);

            for(int len = number.length() - 1, j = len; j >= 0; j--) list.add(0,Character.getNumericValue(number.charAt(j)));

        }

        int size = list.size();

        int[] result = new int[size];

        for(int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}