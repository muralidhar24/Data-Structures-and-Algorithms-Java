
// Problem: Reverse Only Letters
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointer with Character Filtering (letters only)
// Time Complexity: O(n)
// Space Complexity: O(n)   // due to char array

class Solution {
    public String reverseOnlyLetters(String s) {

        char ch[] = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while(left < right) {

            while(!(Character.isLetter(ch[left])) && left < right)
                left++;

            while(!(Character.isLetter(ch[right])) && left < right)
                right--;

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);
    }
}