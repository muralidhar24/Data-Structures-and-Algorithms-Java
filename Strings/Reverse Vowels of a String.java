
// Problem: Reverse Vowels of a String
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointer with HashSet to identify vowels
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        StringBuilder str = new StringBuilder(s);
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        while(left < right) {

            if(!(vowels.contains(str.charAt(left)))) {
                left++;
            }
            if(!(vowels.contains(str.charAt(right)))) {
                right--;
            }

            if((vowels.contains(str.charAt(left))) && (vowels.contains(str.charAt(right)))) {

                char ch = str.charAt(left);
                str.setCharAt(left, str.charAt(right));
                str.setCharAt(right, ch);
                left++;
                right--;
            }
            
        }
        return str.toString();
    }
}