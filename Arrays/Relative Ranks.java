// Problem: Relative Ranks
// Platform: LeetCode
// Difficulty: Easy
// Approach: Repeatedly find minimum unvisited score and assign ranks
// Time Complexity: O(n²)
// Space Complexity: O(n)
// Optimal: ❌ Not optimal (can be solved in O(n log n) using sorting)

class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        HashSet<Integer> set = new HashSet<>();

        int size = score.length;

        String[] result = new String[score.length];

        int rank = size;

        for (int index = 0; index < size; index++) {

            int position = 0;
            int min = Integer.MAX_VALUE;

            for (int innerIndex = 0; innerIndex < size; innerIndex++) {

                if (set.contains(score[innerIndex]))
                    continue;

                if (min > score[innerIndex]) {
                    min = score[innerIndex];
                    position = innerIndex;
                }
            }

            if (rank == 1)
                result[position] = "Gold Medal";

            else if (rank == 2)
                result[position] = "Silver Medal";

            else if (rank == 3)
                result[position] = "Bronze Medal";

            else
                result[position] = String.valueOf(rank);

            set.add(score[position]);

            rank--;
        }

        return result;
    }
}