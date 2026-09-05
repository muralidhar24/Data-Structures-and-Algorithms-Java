
// Problem: 4Sum
// Platform: LeetCode
// Difficulty: Medium
// Approach: Sort + Two Pointers
// Time Complexity: O(n^3)
// Space Complexity: O(log n) — sorting space (implementation-dependent)
// Optimal: Yes ✅

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0, size = nums.length; i < size - 3; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < size - 2; j++) {

                if (j != i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = size - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j]
                             + nums[left] + nums[right];

                    if (sum == target) {

                        List<Integer> list = new ArrayList<>();

                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);

                        result.add(list);

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;

                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return result;
    }
}