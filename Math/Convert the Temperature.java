
// Problem: Convert the Temperature
// Platform: LeetCode
// Difficulty: Easy
// Approach: Apply Kelvin and Fahrenheit conversion formulas
// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimal: Yes ✅ (direct mathematical computation)

class Solution {
    public double[] convertTemperature(double celsius) {

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        return new double[] { kelvin, fahrenheit };
    }
}