
// Problem: 3Sum
// Platform: LeetCode
// Difficulty: Medium
// Approach: Sort the array, fix one element, then use two pointers to find the remaining two elements whose sum makes zero while skipping duplicates.
// Time Complexity: O(n²)
// Space Complexity: O(log n) to O(n) depending on the sorting implementation
// Optimal: Yes ✅

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int index = 0, size = nums.length; index < size - 2; index++) {

            if (nums[index] > 0)
                break;

            if (index != 0 && nums[index] == nums[index - 1])
                continue;

            int left = index + 1;
            int right = size - 1;

            while (left < right) {

                int sum = nums[index] + nums[left] + nums[right];

                if (sum == 0) {

                    List<Integer> triplets = new ArrayList<>();

                    triplets.add(nums[index]);
                    triplets.add(nums[left]);
                    triplets.add(nums[right]);

                    list.add(triplets);

                    while (left < right && nums[left] == nums[left + 1])
                        left++;

                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;

                } else if (sum > 0) {

                    right--;

                } else {

                    left++;
                }
            }
        }

        return list;
    }
}