
// Problem: Rank Transform of an Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Copy the array, sort it, assign ranks to unique values using a HashMap,
// then replace each original element with its corresponding rank.
// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Optimal: Yes ✅

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] temp = new int[arr.length];

        for (int index = 0, size = temp.length; index < size; index++)
            temp[index] = arr[index];

        Arrays.sort(temp);

        int pos = 1;

        for (int index = 0, size = temp.length; index < size; index++)

            if (!map.containsKey(temp[index])) {
                map.put(temp[index], pos);
                pos++;
            }

        for (int index = 0, size = arr.length; index < size; index++)
            arr[index] = map.get(arr[index]);

        return arr;
    }
}