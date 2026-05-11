
// Problem: Word Pattern
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashMap + HashSet to maintain bijection (one-to-one mapping)
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (this is the expected and efficient approach)

class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] str = s.split(" ");

        if(!(str.length == pattern.length()))
            return false;

        for(int i=0; i<pattern.length(); i++) {

            char ch = pattern.charAt(i);

            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(str[i])) 
                    return false;

            } else {
                if(set.contains(str[i])) {
                return false;
                } else {
                    map.put(ch, str[i]);
                set.add(str[i]);
                }
            }
        }

        return true;
    }
}