class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] n = new int[2];
      
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            
            if (sum == target) {
                n[0] = l+1; 
                n[1] = r+1; 
                return n;
            }
            else if (sum > target) {
                r--; 
            }
            else {
                l++; 
            }
        }
        return n;
    } 
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna