
// Problem: Check If a Word Occurs As a Prefix of Any Word in a Sentence
// Platform: LeetCode
// Difficulty: Easy
// Approach: Split the sentence into words and check whether each word starts with the search word
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (expected solution)

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] names = sentence.split(" ");

        for (int index = 0, size = names.length; index < size; index++) {

            if (names[index].indexOf(searchWord) == 0)
                return index + 1;
        }

        return -1;
    }
}