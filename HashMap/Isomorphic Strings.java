
// Problem: Isomorphic Strings
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashMap + HashSet to maintain one-to-one character mapping (bijection)
// Time Complexity: O(n)
// Space Complexity: O(1)   // at most 256 characters
// Optimal: Yes ✅ (standard and efficient solution)

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int index = 0; index < s.length(); index++) {
            
            char sChar = s.charAt(index);
            char tChar = t.charAt(index);

            if(map.containsKey(sChar)) {

                if(!(map.get(sChar) == tChar))
                    return false;

            } else {

                if(set.contains(tChar)) {
                    return false;
                } else {
                    set.add(tChar);
                    map.put(sChar, tChar);
                }

            }
        }

        return true;
    }
}