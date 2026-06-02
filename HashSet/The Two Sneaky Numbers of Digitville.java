
// Problem: The Two Sneaky Numbers of Digitville
// Platform: Custom
// Difficulty: Easy
// Approach: HashSet to detect duplicate numbers
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (efficient duplicate detection approach)

class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        HashSet<Integer> map = new HashSet<>();

        int[] arr = new int[2];
        int index = 0;

        for (int number : nums) {

            if (map.contains(number)) {

                arr[index] = number;
                index++;

            } else {
                map.add(number);
            }
        }

        return arr;
    }
}