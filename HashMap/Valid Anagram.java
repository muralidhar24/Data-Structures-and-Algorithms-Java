
// Problem: Valid Anagram
// Platform: LeetCode
// Difficulty: Easy
// Approach: Frequency Count using HashMap and compare both maps
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public static void method(HashMap<Character, Integer> map , String str)
    {
        for(char ch : str.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        boolean isAnagram = false;
        method(map,s);
        method(map1,t);
        if(map.equals(map1))
        {
            isAnagram = true;
        }
        return isAnagram;
    }
}