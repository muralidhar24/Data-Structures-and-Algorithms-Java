
// Problem: Find and Replace Pattern
// Platform: LeetCode
// Difficulty: Medium
// Approach: HashMap + HashSet to maintain bijection between word and pattern
// Time Complexity: O(n * m)   // n = number of words, m = length of each word
// Space Complexity: O(1)      // at most 26 mappings (constant space)
// Optimal: Yes ✅ (standard and efficient solution)

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> result = new ArrayList<>();

        for(int i=0; i<words.length; i++) {

            HashSet<Character> set = new HashSet<>();
            HashMap<Character, Character> map = new HashMap<>();

            String word = words[i];
            boolean isMatch = true;;

            for(int j=0; j< word.length(); j++) {

                char stringChar = word.charAt(j);
                char patternChar = pattern.charAt(j);
                if(map.containsKey(stringChar)) {

                    if(!(map.get(stringChar) == patternChar)) {
                        isMatch = false;
                        break;
                    }

                } else {
                    if(set.contains(patternChar)) {
                        isMatch = false;
                        break;
                    }
                    else {
                        set.add(patternChar);
                        map.put(stringChar, patternChar);
                    }
                }
            }
            if(isMatch)
            result.add(word);
            
        }

        return result;
    }
}