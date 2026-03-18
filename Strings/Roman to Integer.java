
// Problem: Roman to Integer
// Platform: LeetCode
// Difficulty: Easy
// Approach: String Traversal + Greedy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public static int charToNum(char ch)
    {
        int result = 0;
        switch(ch)
        {
            case 'I' : result = 1;
            break;
            case 'V' : result = 5;
            break;
            case 'X' : result = 10;
            break;
            case 'L' : result = 50;
            break;
            case 'C' : result = 100;
            break;
            case 'D' : result = 500;
            break;
            case 'M' : result = 1000;
            break;
            default : break;
        }
        return result;
    }
    public int romanToInt(String s) {
        int result = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.length() > i+1 && charToNum(s.charAt(i)) < charToNum(s.charAt(i+1)))
            {
                result += (charToNum(s.charAt(i+1)) - charToNum(s.charAt(i)));
                System.out.println(charToNum(s.charAt(i+1)) - charToNum(s.charAt(i)));
                i++;
            }
            else
            {
                result += charToNum(s.charAt(i));
            }
        }
        return result;
    }
}