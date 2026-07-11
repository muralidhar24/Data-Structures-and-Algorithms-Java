
// Problem: Median of Two Sorted Arrays
// Platform: LeetCode
// Difficulty: Hard
// Approach: Merge both arrays into a list, sort it, and compute the median
// Time Complexity: O((m + n) log(m + n))
// Space Complexity: O(m + n)
// Optimal: ❌ No (accepted, but the problem requires O(log(m + n)))

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int num : nums1)
            arr.add(num);

        for (int num : nums2)
            arr.add(num);

        Collections.sort(arr);

        if (arr.size() % 2 == 0) {
            double result = arr.get(arr.size() / 2)
                          + arr.get(arr.size() / 2 - 1);

            return result / 2.0;
        }

        return arr.get(arr.size() / 2);
    }
}