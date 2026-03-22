
// Problem: Find All Anagrams in a String
// Platform: LeetCode
// Difficulty: Medium
// Approach: Sliding Window with Sorting comparison
// Time Complexity: O((n - m + 1) * m log m)   // sorting each window
// Space Complexity: O(m)   // temporary char arrays

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = p.length() - 1;

        char[] ch = p.toCharArray();
        Arrays.sort(ch);

        while(right < s.length()) {

            char[] temp = s.substring(left, right+1).toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(temp, ch)) {
                list.add(left);
            }
            left++;
            right++;
        }

        return list;
    }
}