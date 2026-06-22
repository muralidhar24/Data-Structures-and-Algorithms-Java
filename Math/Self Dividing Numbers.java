
// Problem: Self Dividing Numbers
// Platform: LeetCode
// Difficulty: Easy
// Approach: Check each number by examining its digits and verifying divisibility
// Time Complexity: O((right - left + 1) × d)   // d = number of digits
// Space Complexity: O(1)   // excluding output list
// Optimal: Yes ✅ (expected digit-manipulation solution)

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();

        for (int index = left; index <= right; index++) {

            int temp = index;

            while (temp > 0) {

                if (temp % 10 == 0 ||
                    !(index % (temp % 10) == 0))
                    break;

                temp = temp / 10;
            }

            if (temp == 0)
                list.add(index);
        }

        return list;
    }
}