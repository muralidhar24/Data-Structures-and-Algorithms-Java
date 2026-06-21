
// Problem: Jewels and Stones
// Platform: LeetCode
// Difficulty: Easy
// Approach: Frequency array for uppercase and lowercase letters
// Time Complexity: O(n + m)
// Space Complexity: O(1)
// Optimal: Yes ✅ (efficient counting approach without HashMap)

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0;

        int[] stonesArray = new int[52];

        for(char ch : stones.toCharArray()) {

            if("abcdefghijklmnopqrstuvwxyz".indexOf(ch) != -1) stonesArray[ch - 'a'] += 1;
            
            else stonesArray[ch - 'A' + 26] += 1;
        }

        for(int i=0, size = jewels.length(); i< size; i++) {

            char ch = jewels.charAt(i);

            if("abcdefghijklmnopqrstuvwxyz".indexOf(ch) != -1) count = count + stonesArray[ch - 'a'];

            else count = count + stonesArray[ch - 'A' + 26];
        }

        return count;

    }
}